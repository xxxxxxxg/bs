/*
***********************************************************
This mix-in includes a computed properties and methods that
are useful in displaying a calendar. It has no state.
***********************************************************
*/
export default {
  methods: {
		// ******************************
		// Series
		// ******************************
    today () {
      return this.dateOnly(new Date())
    },

    beginningOfPeriod (d, periodUom, startDow) {
      switch (periodUom) {
        case 'year':
          return new Date(d.getFullYear(), 0)
        case 'month':
          return new Date(d.getFullYear(), d.getMonth())
        case 'week':
          return this.beginningOfWeek(d, startDow)
        default:
          return null
      }
    },

    daysOfWeek (weekStart) {
      return Array(7)
				.fill()
				.map((_, i) => this.addDays(weekStart, i))
    },

		// ********************************************
		// Date transforms that retain time of day
		// ********************************************

    addDays (d, days) {
      return new Date(
				d.getFullYear(),
				d.getMonth(),
				d.getDate() + days,
				d.getHours(),
				d.getMinutes(),
				d.getSeconds()
			)
    },

    beginningOfWeek (d, startDow) {
      return this.addDays(d, (startDow - d.getDay() - 7) % -7)
    },
    endOfWeek (d, startDow) {
      return this.addDays(this.beginningOfWeek(d, startDow), 7)
    },

		// ********************************************
		// Date transforms that ignore/wipe time of day
		// ********************************************
    beginningOfMonth (d) {
      return new Date(d.getFullYear(), d.getMonth())
    },

    instanceOfMonth (d) {
      return Math.ceil(d.getDate() / 7)
    },

		// This function increments a date by a given number of date units. Accepted units are: year, month, week. For year and month,
		// 这个函数使日期增加一个给定数量的日期单位。 接受的单位是：年，月，周。 一年和一月
		// the day of the month is unchanged. This could cause an unexpected result if the units are 'month' and the starting day is
        // 该月的某天不变。 如果单位是“月”并且开始日期是这样的话，这可能会导致意外的结果
		// higher than the number of days in the destination month. The count can be positive or negative.
		// 高于目标月份的天数。 计数可以是正数也可以是负数。
    incrementPeriod (d, uom, count) {
      return new Date(
				d.getFullYear() + (uom === 'year' ? count : 0), // 获取年份
				d.getMonth() + (uom === 'month' ? count : 0), // 获取月份
				d.getDate() + (uom === 'week' ? count * 7 : 0) // 月份的某一天
			)
    },

		// ******************************
		// Date formatting
		// ******************************

    paddedMonth (d) {
      return ('0' + String(d.getMonth() + 1)).slice(-2)
    },
    paddedDay (d) {
      return ('0' + String(d.getDate())).slice(-2)
    },

    isoYearMonth (d) {
      return d.getFullYear() + '-' + this.paddedMonth(d)
    },
    isoYearMonthDay (d) {
      return this.isoYearMonth(d) + '-' + this.paddedDay(d)
    },
    isoMonthDay (d) {
      return this.paddedMonth(d) + '-' + this.paddedDay(d)
    },
    formattedTime (d, locale, options) {
			// Assume midnight = 'all day' or indeterminate time
      if (d.getHours() === 0 && d.getMinutes() === 0 && d.getSeconds() === 0) return ''
			// If Intl is not supported, send back the 24-hour, zero-padded
			// hours and minutes, expressed as local time.
      if (!this.supportsIntl()) {
        var ms = new Date().getTimezoneOffset() * 60000 // TZ offset in milliseconds
        return new Date(d - ms).toISOString().slice(11, 16)
      }
      return d.toLocaleTimeString(locale, options)
    },

		// ******************************
		// Date comparisons
		// ******************************

		// Number of whole days between two dates. If present, time of day is ignored.
		// Have to use setUTCHours to ensure that DST changes between these dates don't
		// result in a fractional answer.
    dayDiff (d1, d2) {
      const endDate = new Date(d2.getFullYear(), d2.getMonth(), d2.getDate())
      let startDate = new Date(d1.getFullYear(), d1.getMonth(), d1.getDate())
      endDate.setUTCHours(0, 0, 0, 0)
      startDate.setUTCHours(0, 0, 0, 0)
      return (endDate - startDate) / 86400000
    },

    isSameDate (d1, d2) {
			// http://stackoverflow.com/questions/492994/compare-two-dates-with-javascript
      return this.dayDiff(d1, d2) === 0
    },
    isSameDateTime (d1, d2) {
      return d1.getTime() === d2.getTime()
    },
    isSameMonth (d1, d2) {
      return (
				d1.getFullYear() === d2.getFullYear() && d1.getMonth() === d2.getMonth()
      )
    },

    isPastMonth (d) {
      return this.beginningOfMonth(d) < this.beginningOfMonth(this.today())
    },
    isFutureMonth (d) {
      return this.beginningOfMonth(d) > this.beginningOfMonth(this.today())
    },

    isInFuture (d) {
      return this.dateOnly(d) > this.today()
    },
    isInPast (d) {
      return this.dateOnly(d) < this.today()
    },
    isLastInstanceOfMonth (d) {
      return d.getMonth() !== this.addDays(d, 7).getMonth()
    },
    isLastDayOfMonth (d) {
      return d.getMonth() !== this.addDays(d, 1).getMonth()
    },

		// Courtesy https://stackoverflow.com/questions/33908299/javascript-parse-a-string-to-date-as-local-time-zone/42626876#42626876
    fromIsoStringToLocalDate (s) {
      let ds = s.split(/\D/).map(s => Number(s))
      ds[1]-- // adjust month
      return new Date(...ds)
    },

    toLocalDate (d) {
      return typeof d === 'string'
				? this.fromIsoStringToLocalDate(d)
				: new Date(d)
    },

    dateOnly (d) {
			// Always use a copy, setHours mutates argument
      const d2 = new Date(d)
      d2.setHours(0, 0, 0, 0)
      return d2
    },

		// ******************************
		// Localization
		// ******************************

    languageCode (l) {
      return l.substring(0, 2)
    },

    supportsIntl () {
      return typeof Intl !== 'undefined'
    },

    getFormattedMonthNames (locale, format) {
			// Use the provided locale and format if possible to obtain the name of the month
      if (!this.supportsIntl()) return Array(12).fill('')
      const formatter = new Intl.DateTimeFormat(locale, { month: format })
			// The year doesn't matter, using 2017 for convenience
      return Array(12)
				.fill()
				.map((_, i) => formatter.format(new Date(2017, i, 1)))
    },

    getFormattedWeekdayNames (locale, format, startingDayOfWeek) {
			// Use the provided locale and format if possible to obtain the name of the days of the week
      if (!this.supportsIntl()) return Array(7).fill('')
      const formatter = new Intl.DateTimeFormat(locale, { weekday: format })
			// 2017 starts on Sunday, so use it as the baseline date
      return Array(7)
				.fill()
				.map((_, i) =>
					formatter.format(new Date(2017, 0, (i + 1 + startingDayOfWeek) % 7))
				)
    },

    getDefaultBrowserLocale () {
			// If not running in the browser, cannot determine a default, return the code for unknown (blank is invalid)
      if (typeof navigator === 'undefined') return 'unk'
			// Return the browser's language setting, implementation is browser-specific
      return (navigator.languages && navigator.languages.length
				? navigator.languages[0]
				: navigator.language || navigator.browserLanguage
			).toLowerCase()
    }
  }
}
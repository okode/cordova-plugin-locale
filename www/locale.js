var exec = require('cordova/exec');

var locale = {
    getCountryCode: function(success, error) {
        exec(success, error, "Locale", "getCountryCode", []);
    }
};

module.exports = locale;
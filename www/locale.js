var exec = require('cordova/exec');

var locale = {
    countryCode: function(success, error) {
        exec(success, error, "Locale", "countryCode", []);
    }
};

module.exports = locale;
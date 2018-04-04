var exec = require('cordova/exec');

var locale = {
    countryCode: function() {
        exec(null, null, "Locale", "countryCode", []);
    }
};

module.exports = locale;
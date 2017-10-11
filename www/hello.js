/*global cordova, module*/

module.exports = {
    
    start: function (name, successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, "Hello", "start", [name]);
    }
};

// Download the Node helper library from twilio.com/docs/node/install
// These vars are your accountSid and authToken from twilio.com/user/account
var accountSid = 'ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX';
var authToken = "{{ auth_token }}";
var client = require('twilio')(accountSid, authToken);

client.messages('MM800f449d0399ed014aae2bcc0cc2f2ec').media.list(function(err, data) {
    data.medias.forEach(function(media) {
        console.log(media.ContentType);
    });
});
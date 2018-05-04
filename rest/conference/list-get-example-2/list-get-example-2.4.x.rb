# Get twilio-ruby from twilio.com/docs/ruby/install
require 'twilio-ruby'

# Get your Account Sid and Auth Token from twilio.com/user/account
account_sid = 'ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX'
auth_token = 'your_auth_token'
@client = Twilio::REST::Client.new(account_sid, auth_token)

# Loop over conferences and print out a property for each one
@client.account.conferences.list(status: 'in-progress',
                                 friendly_name: 'MyRoom').each do |conference|
  puts conference.status
end

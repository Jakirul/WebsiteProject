HTML (located in src/main/resources/templates):
• book.html
• contactus.html
• index.html
• Mens.html
• mensShoe1.html
• mensShoe2.html
• mensShoe3.html
• mensShoe4.html
• profile.html
• register.html
• users.html
• womens.html
• womensShoe1.html
• womensShoe2.html
• womensShoe3.html
• womensShoe4.html

CSS (located in src/main/resources/static/css):
• book.css
• database.css
• form.css
• mens.css
• mensShoe1.css
• mensShoe2.css
• mensShoe3.css
• mensShoe4.css
• profile.css
• register.css
• style.css
• womens.css
• womensShoe1.css
• womensShoe2.css
• womensShoe3.css
• womensShoe4.css

validation behaviour:
1) contactus.html
1a) in the "container contact-form" div class, I used "required placeholder" so that the user cannot submit without filling in the field. I used HTML validation to make sure it validates.
1b) when filling in the email, you must have an @ symbol or else it gives an error message
2) register.html
2a) While registering, you have to fill in your first name, second name, email and password or else it will give error messages. I used HTML validation to make sure it validates.

client side JS:
• mensShoe1.js
• mensShoe2.js
• mensShoe3.js
• mensShoe4.js
• womensShoe1.js
• womensShoe2.js
• womensShoe3.js
• womensShoe4.js

Database writes:
1) Booking.java - On the h2 database (localhost:8443/h2), I have a booking table
1a) the user goes on book.html and the information goes to the profile.html which also transfers data to the booking table in h2
2) shoeUser.java - On the h2 database (localhost:8443/h2), I have a shoeUser table
2a) the user signs up and their user detail goes on profile.html and also transfers data to the shoeUser table in h2
3) LoginHistory.java - On the h2 database (localhost:8443/h2), I have a Login History table
3a) the user logs in and their log in data and time goes on profile.html and also transfers this info to the login history table in h2

Database reads:
1) Profile page:
1a) when you register, it adds the email, first name and second name to a table in the profile page. It reads it from the shoeUser database table
1b) When you log in, it saves the log in date and time on the login history table in the profile page. It reads it from the LoginHistory database table.
1c) When you register your interest for a shoe, it adds the shoe name, shoe size and shoe quantity you selected on the booking table in profile page. It reads it from the booking database table.

Security:
1) In application.properties, I implemented the certificate using TLS. It also adds https in front of the localhost url and also changes the server port to 8443.
2) SecurityConfig.java - I implemented BCrypt so that any passwords gets encrypted as soon as you register. This is apparent in ShoeUser.java where I wrote "this.password = new BCryptPasswordEncoder().encode(password);" This encrypts the password. You can see the encrypted password in the shoeUser database table in h2.

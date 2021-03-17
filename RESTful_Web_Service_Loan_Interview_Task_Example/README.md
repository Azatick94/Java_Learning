
<b>TASK:</b><br>
Create a tiny RESTful web service with the following business requirements:

<h5>Application must expose REST API endpoints for the following functionality:</h5>
* apply for loan (loan amount, term, name, surname and personal id must be provided)
* list all approved loans
* list all approved loans by user

<h5>Service must perform loan application validation according to the following rules and reject application if:</h5>
* Application comes from blacklisted personal id
* N application / second are received from a single country (essentially we want to limit number of loan applications coming from a country in a given timeframe)

<h5>Service must perform origin country resolution using a web service (you should choose one) and store country code together with the loan application. Because network is unreliable and services tend to fail, let's agree on default country code - "lv".</h5>



---
<b>Used sources as an example</b>:<br>
* <a href="https://www.youtube.com/watch?v=d21_HSVdpDA">Spring Boot Data RESTFull API Тестовое задание Java</a><br>
* <a href="https://github.com/peterarsentev/finabay">GitHub directory</a>




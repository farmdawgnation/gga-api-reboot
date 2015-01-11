#!/bin/bash

wsimport -Xnocompile -d src/main/java -p gov.ga.legis.session "http://webservices.legis.ga.gov/GGAServices/Session/Service.svc?wsdl"
wsimport -Xnocompile -d src/main/java -p gov.ga.legis.legislation "http://webservices.legis.ga.gov/GGAServices/Legislation/Service.svc?wsdl"
wsimport -Xnocompile -d src/main/java -p gov.ga.legis.members "http://webservices.legis.ga.gov/GGAServices/Members/Service.svc?wsdl"
wsimport -Xnocompile -d src/main/java -p gov.ga.legis.committees "http://webservices.legis.ga.gov/GGAServices/Committees/Service.svc?wsdl"
wsimport -Xnocompile -d src/main/java -p gov.ga.legis.votes "http://webservices.legis.ga.gov/GGAServices/Votes/Service.svc?wsdl"

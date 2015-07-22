#Requirements

## Use cases

###Precoling:
During precoolig Recuperation is running on 2nd or 3rd power level depends on current setting. Possible would be also that it will start on 3rd power level and switch to 2nd after reaching comfortable temperature.
	
	
#####No precoling due to highe temp outside	
	It is 11 pm and:  
	TINCON = 22
	TINACT = 25
	TOUTACT = 24
	PRECOOL = 2
	
Precooling will start and will be runing till TINACT reach 24c then it will stop no precoolign is used as theris no so cold outside
	
#####There is enought low temperature outside so there will be precooling
    It is 3 am:
	TINCON = 22
	TINACT = 24
	TOUTACT = 18
	PRECOOL = 2
	
Precoolign will start and will be running till inside temp is 20 as porecooling is set to 2c 

### Kitchen, Bathroom ventilation:
	
There is button in kitchen and bathrooms. It is not possible to distiquish which button has been pressed.
Onece is button pressed then recuperation will start working on 2nd or 3rd power level depends on current configuration it will be on higher level for certain amound of time. 

## Technical specification

* All settings needs to be adjustable on fly without stopping application idealy thru web but property file would be sufficient for start
* Application will run on RaspberyPi by and will **NOT** use database
* All Temperature imputs will be read from OZWx72 siemence webserver [webserver] thru WEB API
* it will not be possible to change data on webserver
* It is possible to set frequency of temperature reads
* It id possible to set precooling factor in C
* It is possible to set Ventilation length

### Parameters djustabel by user
* Precooling factor
* Precooling ventilation level 2/3
* Precoolign ventilation mode 1levle mode or 2 levels mode






  





		
	

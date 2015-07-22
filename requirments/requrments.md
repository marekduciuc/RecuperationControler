#Requirments

## Usecases

###Precoling:
Durig precoolig Recuperation is running on 2nd or 3rd power level depends on current setting. Possible woudl be also that it will start on 3rd power level and switch to 2nd after reaching comrotable temperature.
	
	
#####No precoling due to highe temp outside	
	It is 11 pm and:  
	TINCON = 22
	TINACT = 25
	TOUTACT = 24
	PRECOOL = 2
	
Precooling will start and will be runing till TINACT reach 24c then it will stop no precoolign is used as theris no so cold outside
	
#####There is enought low temperature outside so ther will be precooling
    It is 3 am:
	TINCON = 22
	TINACT = 24
	TOUTACT = 18
	PRECOOL = 2
	
Precoolign will start and will be running till inside temp is 20 as porecooling is set to 2c 

### Kichen, Bathroom ventilation:
	
There is button in kichen and bathrooms. It is not possibel to distiquishe which button has been pressed.
Onec i s button presed then recuperation will start working on 2nd or 3rd power level depends on current configuration it will be on higher level for centrain ammound of time. 

## Technical specification

* All settings needs to be adjitable onfly without stoping application idelay thru web but property file woudl be sufficient for start
* Application will run on RaspberyPi by and will NOT use database
* All Temparature imouts will be read from OZWx72 siemence webserver [webserver] thru WEB API
* it will not be possibele to change data on webserver
* It is possible to set frequency of temperature reads
* It id possibel to set precooling factor in C
* It is possibel to set Ventilation lenght




  





		
	
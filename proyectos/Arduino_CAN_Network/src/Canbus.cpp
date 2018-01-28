/**
 * 
 *
 * Copyright (c) 2008-2009  All rights reserved.
 */

#if ARDUINO>=100
	#include <Arduino.h> // Arduino 1.0
#else
	#include <Wprogram.h> // Arduino 0022
#endif

#include <stdint.h>
#include <avr/pgmspace.h>

#include <stdio.h>
#include <avr/io.h>
#include <avr/interrupt.h>
#include <util/delay.h>
#include "pins_arduino.h"
#include <inttypes.h>
#include "global.h"
#include "mcp2515.h"
#include "defaults.h"
#include "Canbus.h"




/* C++ wrapper */
CanbusClass::CanbusClass() {

 
}
char CanbusClass::message_rx(unsigned char *buffer) {
		tCAN message;
	
		if (mcp2515_check_message()) {
		
			
			// Lese die Nachricht aus dem Puffern des MCP2515
			if (mcp2515_get_message(&message)) {
			//	print_can_message(&message);
			//	PRINT("\n");
				buffer[0] = message.data[0];
				buffer[1] = message.data[1];
				buffer[2] = message.data[2];
				buffer[3] = message.data[3];
				buffer[4] = message.data[4];
				buffer[5] = message.data[5];
				buffer[6] = message.data[6];
				buffer[7] = message.data[7];								
//				buffer[] = message[];
//				buffer[] = message[];
//				buffer[] = message[];
//				buffer[] = message[];																												
			} else {
				//	PRINT("Kann die Nachricht nicht auslesen\n\n");
			}
		}

}

char CanbusClass::message_tx(void) {
	tCAN message;

	// einige Testwerte
	message.id = 0x7DF;
	message.header.rtr = 0;
	message.header.length = 8;
	message.data[0] = 0x02;
	message.data[1] = 0x01;
	message.data[2] = 0x05;
	message.data[3] = 0x00;
	message.data[4] = 0x00;
	message.data[5] = 0x00;
	message.data[6] = 0x00;
	message.data[7] = 0x00;						
	
	//	mcp2515_bit_modify(CANCTRL, (1<<REQOP2)|(1<<REQOP1)|(1<<REQOP0), (1<<REQOP1));	
	mcp2515_bit_modify(CANCTRL, (1<<REQOP2)|(1<<REQOP1)|(1<<REQOP0), 0);
		
	if (mcp2515_send_message(&message)) {
		//	SET(LED2_HIGH);
		return 1;
	
	} else {
		//	PRINT("Fehler: konnte die Nachricht nicht auslesen\n\n");
		return 0;
	}
	return 1;
}

char CanbusClass::ecu_req(unsigned char pid,  char *buffer) {
	tCAN message;
	float engine_data;
	int timeout = 0;
	char message_ok = 0;
	// Prepair message
	message.id = PID_REQUEST;
	message.header.rtr = 0;
	message.header.length = 8;
	message.data[0] = 0x02;
	message.data[1] = 0x01;
	message.data[2] = pid;
	message.data[3] = 0x00;
	message.data[4] = 0x00;
	message.data[5] = 0x00;
	message.data[6] = 0x00;
	message.data[7] = 0x00;						
	
	mcp2515_bit_modify(CANCTRL, (1<<REQOP2)|(1<<REQOP1)|(1<<REQOP0), 0);
	
	if (mcp2515_send_message(&message)) {
	}
}


char CanbusClass::init(unsigned char speed) {
	return mcp2515_init(speed);
}

CanbusClass Canbus;
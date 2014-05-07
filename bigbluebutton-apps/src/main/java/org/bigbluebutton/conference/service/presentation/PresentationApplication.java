/**
* BigBlueButton open source conferencing system - http://www.bigbluebutton.org/
* 
* Copyright (c) 2012 BigBlueButton Inc. and by respective authors (see below).
*
* This program is free software; you can redistribute it and/or modify it under the
* terms of the GNU Lesser General Public License as published by the Free Software
* Foundation; either version 3.0 of the License, or (at your option) any later
* version.
* 
* BigBlueButton is distributed in the hope that it will be useful, but WITHOUT ANY
* WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
* PARTICULAR PURPOSE. See the GNU Lesser General Public License for more details.
*
* You should have received a copy of the GNU Lesser General Public License along
* with BigBlueButton; if not, see <http://www.gnu.org/licenses/>.
*
*/
package org.bigbluebutton.conference.service.presentation;

import org.slf4j.Logger;
import org.bigbluebutton.core.api.IBigBlueButtonInGW;
import org.red5.logging.Red5LoggerFactory;
import org.red5.server.api.Red5;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PresentationApplication {
	private static Logger log = Red5LoggerFactory.getLogger( PresentationApplication.class, "bigbluebutton" );	
		
	private IBigBlueButtonInGW bbbInGW;
	
	public void setBigBlueButtonInGW(IBigBlueButtonInGW inGW) {
		bbbInGW = inGW;
	}
		
	public void clear(String meetingID) {
		
	}

	public void sendConversionUpdate(String messageKey, String meetingId, 
            String code, String presentationId, String presName) {
		bbbInGW.sendConversionUpdate(messageKey, meetingId, code, 
				presentationId, presName);
    }
	
	public void sendPageCountError(String messageKey, String meetingId, 
            String code, String presentationId, int numberOfPages,
            int maxNumberPages, String presName) {
		bbbInGW.sendPageCountError(messageKey, meetingId, code, 
				presentationId, numberOfPages, maxNumberPages, presName);
	}
	
	public void sendSlideGenerated(String messageKey, String meetingId, 
            String code, String presentationId, int numberOfPages,
            int pagesCompleted, String presName) {
		bbbInGW.sendSlideGenerated(messageKey, meetingId, code, 
				presentationId, numberOfPages, pagesCompleted, presName);
	}

	public void sendConversionCompleted(String messageKey, String meetingId, 
            String code, String presentation, int numberOfPages, 
            String presName, String presBaseUrl) {
		bbbInGW.sendConversionCompleted(messageKey, meetingId, 
	            code, presentation, numberOfPages, presName, presBaseUrl);
	}
				
	public void removePresentation(String meetingID, String presentationID){
		bbbInGW.removePresentation(meetingID, presentationID);
    }
	
	public void getPresentationInfo(String meetingID, String requesterID) {
		bbbInGW.getPresentationInfo(meetingID, requesterID, meetingID + "/" + requesterID);
	}
		
	public void sendCursorUpdate(String meetingID, Double xPercent, Double yPercent) {	
		bbbInGW.sendCursorUpdate(meetingID, xPercent, yPercent);
	}
	
	public void resizeAndMoveSlide(String meetingID, Double xOffset, Double yOffset, Double widthRatio, Double heightRatio) {
		bbbInGW.resizeAndMoveSlide(meetingID, xOffset, yOffset, widthRatio, heightRatio);
	}
		
	public void gotoSlide(String meetingID, String pageId){		
		bbbInGW.gotoSlide(meetingID, pageId);
	}
	
	public void sharePresentation(String meetingID, String presentationID, Boolean share){		
		bbbInGW.sharePresentation(meetingID, presentationID, share);
	}
	
	public void getSlideInfo(String meetingID, String requesterID) {		
		bbbInGW.getSlideInfo(meetingID, requesterID,  meetingID + "/" + requesterID);		
	}
		
}

﻿/*
Copyright (c) 2003-2012, CKSource - Frederico Knabben. All rights reserved.
For licensing, see LICENSE.html or http://ckeditor.com/license
*/

CKEDITOR.editorConfig = function( config )
{
	// Define changes to default configuration here. For example:
	// config.language = 'fr';
	//config.uiColor = '#AADC6E';
	config.skin='v2';
	config.uiColor = '#F7B42C';
	config.height = 900;
	config.filebrowserBrowseUrl =  '/travelNote/ckfinder/ckfinder.html' ; 
	config.filebrowserImageBrowseUrl =  '/travelNote/ckfinder/ckfinder.html?type=Images' ;  
    config.filebrowserFlashBrowseUrl =  '/travelNote/ckfinder/ckfinder.html?type=Flash' ;  
    config.filebrowserUploadUrl =  '/travelNote/ckfinder/core/connector/java/connector.java?command=QuickUpload&type=Files' ;  
    config.filebrowserImageUploadUrl =  '/travelNote/ckfinder/core/connector/java/connector.java?command=QuickUpload&type=Images' ;  
    config.filebrowserFlashUploadUrl =  '/travelNote/ckfinder/core/connector/java/connector.java?command=QuickUpload&type=Flash' ;  
    config.filebrowserWindowWidth = '1000';  
    config.filebrowserWindowHeight = '700';  
};

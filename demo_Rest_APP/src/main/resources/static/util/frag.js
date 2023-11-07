sap.ui.define(
    ["jquery.sap.global"],
        function (jQuery) {         
              return {
                callService : function(url,sMethod,oPayload){
                    return new Promise(function(resolve,reject)
                    
                    {
                        switch(sMethod.toUpperCase()){
              
                            case "GET":
                            //code 
                            jQuery.ajax(url,{
                                  type:'GET',
                                  success: function(data){
                                  resolve(data);
                                  },
                                  error : function(err){
                                      reject(err);
                                  }
                                  });
                            break;
                            case "POST":
                              //code 	
                              jQuery.ajax(url,{
                                  type:'POST',
                                  
    							  contentType: "application/json",
                                  data: JSON.stringify(oPayload),
                                  success: function(data){
                                  resolve(data);
                                  },
                                  error : function(err){
                                      reject(err);
                                  }
                                  });
                            break;
                  
                            }
                    });

                        
                    }
                

              }
              
              
        }
        );
    
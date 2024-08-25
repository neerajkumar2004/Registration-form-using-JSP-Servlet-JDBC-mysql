<%-- 
    Document   : sighnup
    Created on : 23-Aug-2024, 1:59:32 am
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
 
    <head>
     
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP</title>
   <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

    <!-- Compiled and minified JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
    </head>
    <body style="background: url(https://images.all-free-download.com/images/graphicwebp/blue_background_201400.webp);background-size: cover; background-attachment: fixed;">
        <div class="container">
            <div class="row">
            <div class="col m6 offset-m3">
            <div class="card">
            <div class="card-content">
                <h3 style="margin-top: 10px;" class="center-align">register here!!</h3>
                <div class="form center-align">
                    <form action="register" method="post" id="myform">
                        <input type="text" name="name" placeholder="enter your name">
                        <input type="password" name="password" placeholder="enter your password">
                        <input type="email" name="email" placeholder="enter your gmail">
                        <button class="btn indigo accent-3" type="submit">register</button>
                    </form>
        </div>
                <div class="loader center-align" style="margin-top: 12px; display: none;">
            
    <div class="preloader-wrapper big active">
      <div class="spinner-layer spinner-blue">
        <div class="circle-clipper left">
          <div class="circle"></div>
        </div><div class="gap-patch">
          <div class="circle"></div>
        </div><div class="circle-clipper right">
          <div class="circle"></div>
        </div>
      </div>

      <div class="spinner-layer spinner-red">
        <div class="circle-clipper left">
          <div class="circle"></div>
        </div><div class="gap-patch">
          <div class="circle"></div>
        </div><div class="circle-clipper right">
          <div class="circle"></div>
        </div>
      </div>

      <div class="spinner-layer spinner-yellow">
        <div class="circle-clipper left">
          <div class="circle"></div>
        </div><div class="gap-patch">
          <div class="circle"></div>
        </div><div class="circle-clipper right">
          <div class="circle"></div>
        </div>
      </div>

      <div class="spinner-layer spinner-green">
        <div class="circle-clipper left">
          <div class="circle"></div>
        </div><div class="gap-patch">
          <div class="circle"></div>
        </div><div class="circle-clipper right">
          <div class="circle"></div>
        </div>
      </div>
    </div>
       <h4>please waite.......</h4>
        </div>
               
        </div>
        </div>
        </div>
        </div>
        </div>
        <script
  src="https://code.jquery.com/jquery-3.7.1.min.js"
  integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo="
  crossorigin="anonymous"></script>
  <script>
      $(document).ready(function(){
          console.log("page is ready......");
          $("#myform").on('submit',function(event){
              event.preventDefault();
              var f=$(this).serialize();
              console.log(f);
              $.ajax({
                  url="register",
                  data=f,
                  type='post',
                  success:function(data, textStatus, jqXHR){
        console.log(data);            
        console.log("success...") ; 
                  },
                  error:function(jqXHR,textStatus,errorthrown){
                      console.log(data);
                      console.log("error.....");
                  }
                  
              });
          });
      });
  </script>
    </body>
</html>

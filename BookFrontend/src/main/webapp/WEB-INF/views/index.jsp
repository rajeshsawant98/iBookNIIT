
<html>
<body>
<jsp:include page="header.jsp"></jsp:include>
<div align=center><h1>HOME PAGE</h1></div>

<div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
  <ol class="carousel-indicators">
    <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
    <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
    <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
  </ol>
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img class="d-block w-100" src="https://i1.wp.com/pnwumc.org/umw/wp-content/uploads/2019/02/education-books.jpg" alt="First slide">
    </div>
    <div class="carousel-item">
      <img class="d-block w-100" src="https://media-exp1.licdn.com/dms/image/C4D1BAQHzsM6Pd6Matw/company-background_10000/0/1592318011391?e=2159024400&v=beta&t=bXnWDIJdAg5LQF4tVQm48x8v07uhUUxs26kEb7Lde-I" alt="Second slide">
    </div>
    <div class="carousel-item">
      <img class="d-block w-100" src="https://www.incimages.com/uploaded_files/image/1920x1080/getty_655998316_2000149920009280219_363765.jpg" alt="Third slide">
    </div>
  </div>
  <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
</div>

<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
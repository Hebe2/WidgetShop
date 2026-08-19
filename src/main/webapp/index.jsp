<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/layout.css">
        <link rel="stylesheet" href="css/style.css">
        <title>Home Page</title>
    </head>
    <body>
        <%@include file="WEB-INF/jspf/navigation.jspf"%>
        <div id="home-banner">
            <h1>Welcome to the Doohickies and widget shop</h1>
        </div>
        <main>
            <div id="products-container">
                <div class="product">
                    <h4 class="product-title">Product 1</h4>
                    <p class="product-description">hwieojdiw</p>
                </div>
                <div class="product">
                    <h4 class="product-title">Product 2</h4>
                    <p class="product-description">jiwel</p>
                </div>
                <div class="product">
                    <h4 class="product-title">Product 3</h4>
                    <p class="product-description">wnejdk</p>
                </div>
                <div class="product">
                    <h4 class="product-title">Product 4</h4>
                    <p class="product-description">ekwld</p>
                </div>
            </div>
        </main>
    </body>
</html>

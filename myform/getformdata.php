<html>
<body>
<?php
$name=$_POST["name"];
$addr=$_POST["addr"];
$hobbies=$_POST["hobbies"];
$city=$_POST["city"];

echo "Name: ".$name."<br>";
echo "Address : ".$addr."<br>";
echo "Gender :" .$_POST["gender"]."<br>";

echo "hobbies : " ;
echo "<ul>";
foreach($hobbies as $h){
	echo "<li>".$h."</li>";
}
echo "</ul>";
echo "City:".$city;

?>


</body>
</html>
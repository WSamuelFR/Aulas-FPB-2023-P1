<?php

session_start();

$_SESSION['logado'] = false;

session_destroy();

header('location: index.php');

?>
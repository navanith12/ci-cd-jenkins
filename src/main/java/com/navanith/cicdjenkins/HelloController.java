package com.navanith.cicdjenkins;
import ...
@RestController
@RequestMapping("/hello")
public class HelloController
{
@GetMapping
public String hello()
{
return "Hello";
}
}

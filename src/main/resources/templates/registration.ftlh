<#import "parts/common.ftlh" as c>
<#import "parts/login.ftlh" as l>
<@c.page>
    <left>
Add new user
<#--${message}-->
<@l.registr "/registration" />
    </left>
</@c.page>
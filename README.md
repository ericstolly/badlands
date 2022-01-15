<div align="center">
  <h1>Badlands - Stormforge API Wrapper</h1>
  
  ![Licence](https://img.shields.io/github/license/ericstolly/badlands?style=for-the-badge)
 
  <a href="https://github.com/ericstolly/badlands/stargazers"><img src="https://img.shields.io/github/stars/ericstolly/badlands" alt="Stars Badge"/></a>
  <a href="https://github.com/ericstolly/badlands/network/members"><img src="https://img.shields.io/github/forks/ericstolly/badlands" alt="Forks Badge"/></a>
  <a href="https://github.com/ericstolly/badlands/pulls"><img src="https://img.shields.io/github/issues-pr/ericstolly/badlands" alt="Pull Requests Badge"/></a>
  <a href="https://github.com/ericstolly/badlands/issues"><img src="https://img.shields.io/github/issues/ericstolly/badlands" alt="Issues Badge"/></a>
  <a href="https://github.com/ericstolly/badlands/graphs/contributors"><img alt="GitHub contributors" src="https://img.shields.io/github/contributors/ericstolly/badlands?color=2b9348"></a>
</div>

## Usage

### Initialising the BadlandsClient.
Using the `BadlandsAuthentication` builder.
```java
BadlandsClient badlandsClient = new BadlandsClient(BadlandsAuthentication.builder().apiKey("API_KEY").secretKey("SECRET_KEY").build());
```

Not using the `BadlandsAuthentication` builder.
```java
BadlandsClient badlandsClient = new BadlandsClient("API_KEY", "SECRET_KEY");
```

### Requests
There is currently only one request you can make, however this will be increased after stability has been reached.

```java
BadlandsClient#getCharacterSheet(String, Realm)#
```
### Example Usage
A working example of the API can be found <a href="https://github.com/ericstolly/badlands">here</a>.
</br>

<div align="center">
  <h2>Special Thanks</h2> 
  <a href="https://github.com/query-wow">query-wow</a> - Who's <a href="https://github.com/Tauri-WoW-Community-Devs/TauriApiWrapper/">C# wrapper </a> contained the ID's of all the special types included in Badlands.</br>
  <a href="https://stormforge.gg/">Stormforge Development Team</a> - Who helped debug many issues with their API throughout the development of Badlands.</br>
</div>

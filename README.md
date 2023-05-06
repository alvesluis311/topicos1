1) Atualizar o Quarkus para a versão 3
 - ./mvnw io.quarkus.platform:quarkus-maven-plugin:3.0.1.Final:update -N -Dstream=3.0
2) Perfil de Usuário
3) PerfilConverter
4) import.sql -> Adicionar o perfil de usuario
5) hash da senha
 - atualizar import.sql
6) TokenJwtService
    <dependency>
    <groupId>io.quarkus</groupId>
      <artifactId>quarkus-smallrye-jwt</artifactId>
    </dependency>
   <dependency>
     <groupId>io.quarkus</groupId>
      <artifactId>quarkus-smallrye-jwt-build</artifactId>
    </dependency>
7) Configurar Properties
	mp.jwt.verify.publickey.location=token/publickey.pem
	mp.jwt.verify.issuer=unitins-jwt
	smallrye.jwt.sign.key.location=token/privatekey.pem

8) Instalar openssl
	Download: https://slproweb.com/products/Win32OpenSSL.html
	Tutorial de instalação: https://thesecmaster.com/procedure-to-install-openssl-on-the-windows-platform/

9) Gerar os arquivos publicKey e privateKey, adiciona-los à pasta token
- openssl genrsa -out rsaPrivateKey.pem 2048
- openssl rsa -pubout -in rsaPrivateKey.pem -out publicKey.pem
- openssl pkcs8 -topk8 -nocrypt -inform pem -in rsaPrivateKey.pem -outform pem -out privateKey.pem

10) Criar o arquivo AuthResource.java
 - criar o arquivo AuthUsuarioDTO.java

11) Adicionar as anotacoes de seguranca
    @PermitAll, @RolesAllowed({"Admin","User"})

12) Tarefa para casa, pesquisar como enviar um token por através de um test. Adicionar em pelo menos uma das classes do seu projeto e enviar como trabalho no educa.









https://learn.microsoft.com/pt-br/windows/wsl/install-manual#step-4---download-the-linux-kernel-update-package



wsl --update 

./mvw compile quarkus:dev


https://developer.mozilla.org/en-US/docs/Web/HTTP/Status


./mvnw quarkus:add-extension -Dextensions='hibernate-validator'


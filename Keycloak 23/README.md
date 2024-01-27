# Activité Pratique N°7 : Sécurité Oauth2, OIDC, JWT, Keycloak
# encadrant : Mohamed YOUSSFI

#  (PART 1)
# Sécuriser les microservices Spring et les applications Angular à l'aide d'Oauth2 OIDC avec Keycloak


run kc + create admin:

![adminKC](https://github.com/YoussefDinar/Dinar-Youssef-JEE-2/assets/94021293/f32d4216-f5fa-4822-b71d-7197f8c7da05)

create client:

![create client](https://github.com/YoussefDinar/Dinar-Youssef-JEE-2/assets/94021293/a3de3e4a-fc49-4080-8462-266af93ae6d4)

create user:

![create user](https://github.com/YoussefDinar/Dinar-Youssef-JEE-2/assets/94021293/1b55d05b-c146-4fc1-a69a-3ce0f0830e90)


create users:

![users](https://github.com/YoussefDinar/Dinar-Youssef-JEE-2/assets/94021293/221cbf78-3378-418c-ba22-de0f1f965131)


role mapping:

![rolemapping](https://github.com/YoussefDinar/Dinar-Youssef-JEE-2/assets/94021293/e396873c-df2a-4b32-8445-fcfb0d9a56d6)


test authentification :

(POSTMAN)

![accessToken](https://github.com/YoussefDinar/Dinar-Youssef-JEE-2/assets/94021293/707c8e35-a7fe-4969-866b-28b4b49cccee)


decodage du token (jwt)

![image](https://github.com/YoussefDinar/Dinar-Youssef-JEE-2/assets/94021293/6e1388a1-6165-4b07-81fc-5a563e777b20)


![jwtsc2](https://github.com/YoussefDinar/Dinar-Youssef-JEE-2/assets/94021293/b8bb4cb5-f0e0-4115-92fe-d194b3b718b6)

public key wallet Realm

![public key](https://github.com/YoussefDinar/Dinar-Youssef-JEE-2/assets/94021293/5dd22434-5e88-434d-8f02-588ab556ea26)


authentification avec refresh_token:

![authrefrtok](https://github.com/YoussefDinar/Dinar-Youssef-JEE-2/assets/94021293/028217f2-9f1c-411c-b3c3-ea8051da2836)


enable Client authentication (client id + client secret):

![enable cli auth](https://github.com/YoussefDinar/Dinar-Youssef-JEE-2/assets/94021293/98fa2845-1e99-4523-ad38-bba214babcf3)


![client sec](https://github.com/YoussefDinar/Dinar-Youssef-JEE-2/assets/94021293/a3ee7088-bcb4-4c20-a81d-5171d162efff)


authentification avec (client id + client secret):

![authclisec](https://github.com/YoussefDinar/Dinar-Youssef-JEE-2/assets/94021293/56ffaaa4-3fcc-4ff4-8058-4f80a3cb91bf)


desactivation de Client authentication

![descliauth](https://github.com/YoussefDinar/Dinar-Youssef-JEE-2/assets/94021293/0e2c5d8c-71ad-4c0b-bcd7-e21657f9c93b)




#  (PART 2)

# Application basée sur les micro-services en utilsant Oauth 2, OIDC, Keycloak :



h2 console + page html Customers:

![h2consolehtmlcust](https://github.com/YoussefDinar/Dinar-Youssef-JEE-2/assets/94021293/7e5db0aa-4719-4a73-be83-5b18aac93feb)


Creation client OAuth:

![1](https://github.com/YoussefDinar/Dinar-Youssef-JEE-2/assets/94021293/bd17f811-fc9c-44f5-b369-0e167c9ea7fd)

Github Client ID + Client secret:

![4](https://github.com/YoussefDinar/Dinar-Youssef-JEE-2/assets/94021293/5922f275-4db2-4598-8f50-5f7b1026095b)


Keycloack Authentication policies:

![5](https://github.com/YoussefDinar/Dinar-Youssef-JEE-2/assets/94021293/fcecdc52-2608-47d2-813d-56b96e4f0996)


interface Login:

![6](https://github.com/YoussefDinar/Dinar-Youssef-JEE-2/assets/94021293/6aa94f19-6c43-4928-bd3f-c3c7c830324c)


Login avec le compte Github :

![66](https://github.com/YoussefDinar/Dinar-Youssef-JEE-2/assets/94021293/fb369357-3501-4e37-ab46-ea1163705519)


Set require SSL to none:

![8 reqssl none](https://github.com/YoussefDinar/Dinar-Youssef-JEE-2/assets/94021293/0965b7c1-d3af-40ce-8831-3641b3dcd68e)


Configuration du client glsid-bdcc-customer-client

![10 ](https://github.com/YoussefDinar/Dinar-Youssef-JEE-2/assets/94021293/8c30abbc-13a5-421e-a1f1-4c2e02fc3a41)


La liste des clients (localhost:4200/customers):

![customers an](https://github.com/YoussefDinar/Dinar-Youssef-JEE-2/assets/94021293/b9fce7e9-3f40-47e1-91af-c6b4bcf9689c)



La liste des produits (localhost:4200/products) :

![p2 an](https://github.com/YoussefDinar/Dinar-Youssef-JEE-2/assets/94021293/243a3e38-eb54-4944-8c0a-cb4c1002464d)



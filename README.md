#####################Application Java###########################################################
##########################Projet-FYC/2023/2024##################################################

# Cette application est basée sur un TomCat, avec une structure SpringBoot
# Vous y trouverez les fichiers nécessaires afin de réaliser et personnaliser votre application en vue de son déploiement.
# Le fichier descriptif est le pom.xml, il doit être placé à la racine du dossier que vous allez créer pour travailler sur votre
# application.

# Créer un dossier de travail comme par exemple :
# mkdir projet_java

# Cloner le dépot : "http://github.com/oujdi83299/fyc/ProjetJava.git"

# Vous verrer le pom.xml, que vous pourrez personnaliser pour : 
# Choisir la nomenclature de l'image de votre application, version, nommage ...
# Gérer les dépendances : 
# - à la base de déonnée PostGres
# - Aux tests de connexion que vous pourrez faire avant la compilation et la création du fichier jar

# Description des dossiers du projet :

# Après le clonage, vous trouverez un dossier src. Ce dossier contient le dossier main, qui est le corps de l'applicatif, et un dossier
# test où sont placés les tests de connexion (FycApplicationTests.java)

# main : il contient le dossier resources/ qui lorsque vous naviguerez à l'intérieur, contient à son tour un dossier static/
# A cet endroit vous pourrez placer votre fichier index.html, qui sera affiché sur le navigateur web.
# resources/ contient par ailleurs le fichier ApplicationProperties dans lequel il vous faudra indiquer les identifiants de connexion 
# à la BDD, le port de connexion, le nom de la BDD, 

# Dockerfile : à placer à la racine du dossier de travail.
Il contient le nom de l'image java utilisée
le mappage du volume persistant sur votre machine hôte, et le volume à l'intérieur du conteneur qui lancera l'image que vous aller générer.
Le port d'exposition de votre machine hôte et celui du conteneur.
La commande qui est exécutée au lancement du conteneur, en l'occurence le fichier jar qui sera copié après compilation dans le conteneur.

# target/ à placer à la racine du dossier de travail.
il contiendra le fichier jar, après la compilation.


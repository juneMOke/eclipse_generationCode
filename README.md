# Projet Multi Activity

## Binômes:

- *DIALLO Mamadou*
- *FUNGWA MOKE Junior*

## Contenu

Ce repertoire contient sept projet qui sont:

- org.eclipse.sirius.sample.multiactivity

		Ce premier projet contient le metamodel à partir duquel nous representons une multy acitiviy android application.
		
-  org.eclipse.sirius.sample.multiactivity.edit / *.editor

		Ces deux projets contienent les classes supports representant le metamodel.

- pje20.androidapp.multiactivity.multiactivitymetamodel.gen.java

		Celui-ci est le projet de la géneration du code avec Acceleo.
		
-  org.eclipse.siruis.sample.multiactivity.project.design

		Dans celui-ci nous pouvons trouver la création et la géneration d'éditeur graphique avec Sirius.

- mytests

		Ici on peut trouver deux exemple de models que nous avions créer pour tester nos diffrenetes réalisations.
		
		mytests/
		└── generated
		    └── org.eclipse.siruis.sample.multiactivitymodels
		        ├── MyFirstModel.multiactivity
		        ├── MySecondApp.multiactivity
		        └── representations.aird
		
- Application1

		Dans ce dernier on trouve L'application android d'un de nos modèle génerée par Acceleo
		
		Les classes java
		
			main
				├── AndroidManifest.xml
				├── java
				    └── pje20
				        └── androidapp
				            └── app1
				                ├── ActivityFive.java
				                ├── ActivityFour.java
				                ├── ActivitySix.java
				                ├── ActivityThree.java
				                ├── ActivityTwo.java
				                ├── MainActivity.java
				                └── popup
				                    └── HelloWorldDialogFragment.java
				
		Les Layouts
		
			├── layout
			    ├── activity_five.xml
			    ├── activity_four.xml
			    ├── activity_main.xml
			    ├── activity_six.xml
			    ├── activity_three.xml
			    ├── activity_two.xml
			
		
			
			
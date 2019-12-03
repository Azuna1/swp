# Softwareprojekt - Altgeräteportal
Vorbereitung:
Alte Eclipse version deinstallieren (Meist einfach den ordner löschen)
in %appdata% ebenfalls den .eclipse den .m2 und .p2 (falls vorhanden) löschen

Alte Java version deinstallieren
 - Windows - programme entfernen -> Java

Installation:
Download der Tools:
https://drive.google.com/open?id=1vlLa5k-M-2eGmJ86695S9jzHU9-Q6VLE
https://drive.google.com/open?id=1Ik5W-Y7OWfprw7Oqiw93y6soXZgaPm_p
https://drive.google.com/open?id=1XQZt3jiSlcandPewYXtlkvLAJJJJaPbD

jdk-13_windows-x64_bin.exe ausführen und installieren.

Windows suche -> "systemumgebungs" -> system umgebungsvariablen -> umgebungsvariablen
unter Systemvariablen den eintrag "PATH" editieren und den pfad zur java JDK angeben (C:\Program Files\Java\jdk-13\bin)
Windows neu starten

eclipse entpacken & starten


Help > Install New Software… > Work with:
http://download.jboss.org/jbosstools/photon/snapshots/updates/
Hinzufügen und anschließend folgende Pakete auswählen:
JBoss Web and Java EE Development
JBoss Application Server Adapters
JBoss Maven support

Falls kompatibilitäts frage, eigene installation beibehalten
Falls Security frage, installation erlauben
Eclipse neu starten

Wildfly zip entpacken

In eclipse -> Window -> show view -> other 
Dann dort Server -> Servers auswählen
Im neuen View (unten in eclipse) neuen server anlegen drücken
Wildfly 18 Auswählen, Alles default lassen -> Finish


GIT:
Beide Pakete installieren
https://gitforwindows.org/
https://tortoisegit.org/download/
Github account erstellen und mir zuschicken falls noch nicht vorhanden.
Anschließend Repository clonen: https://github.com/Azuna1/swp.git


Vaadin:
Select Help ▸ Install New Software…​.
https://vaadin.com/eclipse
Vaadin paket auswählen & installieren
Vaadin account erstellen
Falls Vaadin Designer benutzt werden möchte, lizenz upgraden über das student programm
https://vaadin.com/student-program

Eclipse -> Einstellungen -> Vaadin
Checkbox bei "Automatische Widget compilation" (aktiviert automatische updates über maven)


In Eclipse -> Datei -> Import -> Maven -> Existing Maven project
den ordner "myportal" aus dem GIT auswählen
Warten bis Eclipse fertig ist (status unten rechts in eclipse)
Rechtsclick auf das projekt -> Run As -> Run on server -> wildfly auswählen

######### Ab hier neu!!! ###########

Windows suche -> "systemumgebungs" -> system umgebungsvariablen -> umgebungsvariablen
unter Systemvariablen den eintrag "JBOSS_HOME" anlegen und den pfad zur Wildfly installtion angeben (G:\Programme\wildfly-18.0.0.Final)
Im wildfly order /bin die datei jboss-cli.xml öffnen und in zeile 6 die "urn:jboss:cli:3.4" zu "urn:jboss:cli:3.3" ändern

Windows neu starten


######### Ab hier neu!!! ###########


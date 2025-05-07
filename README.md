# Ecosistem-natural

Acest proiect Java simulează un ecosistem natural în care interacționează plante, animale (erbivore și prădători), surse de apă, și anotimpuri, într-un mediu definit de o pădure. Simularea urmărește comportamentele naturale, cum ar fi hrănirea, deplasarea și schimbările sezoniere.

## Structura Proiectului

Proiectul conține următoarele clase:

| Clasă        | Descriere                                             |
|--------------|--------------------------------------------------------|
| `Main`       | Punctul de intrare în aplicație (clasa principală).   |
| `Animal`     | Clasă abstractă ce definește atributele comune animalelor. |
| `Ierbivor`   | Subclasă a `Animal` – implementează comportamentul specific erbivorelor. |
| `Pradator`   | Subclasă a `Animal` – implementează comportamentul specific prădătorilor. |
| `Planta`     | Reprezintă sursa de hrană pentru erbivore.            |
| `Padure`     | Clasa care definește mediul în care se desfășoară simularea. |
| `Anotimp`    | Enum sau clasă care influențează comportamentele în funcție de anotimp. |
| `Simulare`   | Conține logica principală a simulării (ex: iterarea pașilor, actualizări). |
| `SursaApa`   | Reprezintă punctele de apă din ecosistem.             |
| `Gen`        | Enum sau clasă pentru a distinge sexul animalelor.    |
| `Coordonate` | Clasa care definește poziția fiecărui element pe hartă. |

## Funcționalități
- Plasarea animalelor și plantelor pe o hartă virtuală (pădure).
- Deplasarea animalelor în căutarea hranei.
- Prădătorii vânează ierbivore.
- Anotimpurile influențează comportamentele (de ex. reproducerea, disponibilitatea hranei).
- Sursele de apă atrag animalele.
- Sistem de coordonate pentru poziționare și interacțiuni spațiale.

## Tehnologii utilizate
- Java SE
- Programare Orientată pe Obiecte
- Colecții Java (ex: `List`, `Map`)
- Enum-uri și clase personalizate
- Simulare bazată pe pași (step-by-step loop logic)

## Cum rulezi proiectul
1. Clonează repository-ul:  
   git clone https://github.com/diana-elena-tanasa/Ecosistem-natural.git
2. Deschide proiectul în IntelliJ IDEA sau alt IDE Java
3. Rulează clasa `Main.java`

## Îmbunătățiri viitoare 
- Adăugarea unei interfețe grafice (JavaFX)
- Persistența datelor în fișiere sau baze de date
- Statistică în timp real (număr de plante, animale etc.)

## Ce am învățat
- Concepte de OOP în Java (moștenire, polimorfism, abstractizare)
- Organizarea unui proiect modular
- Gândirea logicii unui ecosistem dinamic
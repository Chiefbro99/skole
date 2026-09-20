# JPLab10 oppgave 2 – ferdig eksempel

Åpne `src/main/java/no/hvl/dat100/jplab10/oppgave2/Hovedprogram.java` i Kode og trykk **Kjør**.
Dette er en egen løsningsversjon. Oppgavemalen i `../JPLab10-oppgave2` er ikke endret.

- `Vare.java`: lærerens vareklasse.
- `Varelager.java`: tabell med fast kapasitet; `antall` peker på neste ledige plass.
- `VarelagerUtils.java`: finner billigste vare, summerer priser, henter varenumre og regner forskjell mellom nabopriser.
- `Hovedprogram.java`: et kjørbart eksempel som bruker alle metodene.

Forventet totalpris er 60.0, billigste vare er Blyant, og prisforskjellene er [25.0, -20.0].
Et fullt lager returnerer false når du prøver å legge til mer. Et mislykket søk returnerer null.
Utils-metodene forutsetter, som i oppgaven, en fylt tabell uten null-plasser.
Eksemplet håndterer også en tom tabell: ingen billigste vare, sum 0 og tomme resultattabeller.
Lageret avviser null som vare, slik at antall alltid teller virkelige varer.

Alle klassene har samme `package` og ligger i tilsvarende mappestruktur. Denne strukturen skal beholdes selv om Kode viser mappekjedene kompakt.

Oppgave og startkode: https://github.com/dat100hib/dat100public/blob/d7d40eed2d30a5e10d275828596534646e6fb48a/programmering/jplab10/JP10.md
Løsningsmetodene og hovedprogrammet er laget som et læringseksempel, ikke hentet fra en offisiell fasit.

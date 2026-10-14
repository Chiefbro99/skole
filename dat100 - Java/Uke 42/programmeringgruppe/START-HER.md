# JavEl – oppgave 1–5

Startkode fra https://github.com/IMStacking/programmeringgruppe. Beregninger og øvrige oppgaveløsninger står fortsatt som TODO.

## Pakker og filer

Alle pakkene ligger under `src/main/java/no/hvl/dat100/javel/`.

| Pakke | Filer | Startprogram |
| --- | --- | --- |
| oppgave1 | DailyPower.java, DayPowerData.java, DayMain.java | DayMain |
| oppgave2 | MonthlyPower.java, MonthPowerData.java, MonthMain.java | MonthMain |
| oppgave3 | Customer.java, PowerAgreementType.java, CustomerMain.java | CustomerMain |
| oppgave4 | Customers.java, CustomersMain.java | CustomersMain |
| oppgave5 | Invoice.java, Invoices.java, CustomerPowerUsageData.java, InvoiceMain.java | InvoiceMain |

`package` i hver fil samsvarer med mappene. Filer i samme pakke trenger ingen import av hverandre.

## Koblinger du skal bruke underveis

- DayMain bruker DayPowerData og DailyPower.
- MonthlyPower importerer DailyPower for å gjenbruke dagsberegningene. MonthMain bruker MonthPowerData og MonthlyPower.
- Customer bruker PowerAgreementType. CustomerMain tester Customer.
- Customers importerer Customer. CustomersMain importerer Customer og PowerAgreementType.
- Invoice importerer Customer og MonthlyPower. Invoices behandler en tabell av Invoice-objekter.
- InvoiceMain importerer Customer, PowerAgreementType og MonthPowerData. CustomerPowerUsageData ligger i samme pakke som InvoiceMain.

Jobb i rekkefølgen 1 → 2 → 3 → 4 → 5. Skriv egne testkall i de fem Main-filene etter hvert. Startkoden kompilerer, men TODO-metodene er ikke ferdige og gir ennå ingen riktige beregninger.

## Kjøring i Kode

Åpne en Main-fil og bruk Java-kjøringen i Kode. Klassene skal kjøres med hele pakkenavnet; for eksempel `no.hvl.dat100.javel.oppgave1.DayMain`.

Fra prosjektmappen i en terminal:

```sh
mkdir -p target/classes
javac --release 23 -encoding UTF-8 -d target/classes $(find src/main/java -name '*.java')
java -cp target/classes no.hvl.dat100.javel.oppgave1.DayMain
```

Maven-oppsettet fra repoet er beholdt og krever JDK 23 eller nyere.

## Små forskjeller mellom tekst og startkode

- Oppgave 4 sier `javael`; kildekoden bruker korrekt `javel` gjennom hele prosjektet.
- Oppgave 5 omtaler CustomerPowerData og CustomersMain; filene i startkoden heter CustomerPowerUsageData og InvoiceMain.
- Oppgave 1 har en feil bokstavmerking før findPeakUsage: metoden svarer til del h; findAvgPower svarer til del i.

Oppgavetekstene ligger i docs/.

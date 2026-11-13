# Use case StreamEveryThing
<br></br>
![UCdiagram](UCdiagram.png)


<br></br>
---
---
<br></br>
<br></br>
<br></br>


## LogIn 
*id: 1*

**Breve descrizione**: L'utente tenta il collegamento con il proprio account tramite le credenziali.
**Attore principale**: User Log  
**Attori secondari**: Autenticatore  
**Precondizioni**: Esistenza dell'account nel sistema.
### Sequenza principale:
    1. L'utente richiede di accedere al sistema.
    2. Il sistema visualizza la pagina di autenticazione.

![LogPage](./Logpage.png)

    3. L'utente inserisce le credenziali.
    4. Il sistema verifica che siano corrette.
    5. Se le credenziali sono corrette:
        5.1 Il sistema garantisce l'accesso.
    6. Altrimenti:
        6.1 Il sistema restituisce un errore sui dati inseriti.

**Post-condizioni**: L'utente ha accesso al proprio account e ai contenuti associati.

### Sequenze alternative:
- Utente non registrato
- Password o User ID dimenticati
- Richiesta di autenticazione a due fattori


<br></br>
---
---
<br></br>
<br></br>
<br></br>


## Download 
*id: 2*

**Breve descrizione**: L'utente premium richiede il download di un contenuto.
**Attore principale**: Utente Premium  
**Attori secondari**: Nessuno  
**Precondizioni**: 
- L'utente deve:
  - Aver effettuato il login
  - Essere un utente premium
  - Aver saldato l'ultimo pagamento
- Il contenuto richiesto deve essere presente sulla piattaforma

### Sequenza principale:
    1. Il sistema mostra la pagina iniziale

![DownloadPage](./Download.png)
    
    2. l'utente sceglie il contentuo da scaricare
    3. Il sistema verifica che l'utente sia collegato.
    4. Se l'utente è collegato:
        4.1 Controlla che sia un utente premium.
        4.2 Se l'utente è premium:
            4.2.1 Controlla che l'ultimo pagamento sia avvenuto.
            4.2.2 Se il pagamento è avvenuto:
                    4.2.2.1 Il sistema permette il download.
            4.2.3 Altrimenti:
                    4.2.3.1 Richiede di effettuare il pagamento.
        4.3 Altrimenti:
            4.3.1 Richiede di passare al piano premium.
    5. Altrimenti:
        5.1 Richiede di effettuare il login.

![LogPage](./Logpage.png)


**Post-condizioni**: L'utente avrà il contenuto all'interno della propria libreria e disponibile offline (o *online*, a seconda delle specifiche).

### Sequenze alternative:
- Utente non registrato
- Utente non pagante
- Utente non premium
- Contenuto non disponibile
- Download non completato per problemi di connessione


<br></br>
---
---


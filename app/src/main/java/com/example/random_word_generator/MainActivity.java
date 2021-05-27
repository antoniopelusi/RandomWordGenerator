package com.example.random_word_generator;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;
import java.util.Timer;

public class MainActivity extends AppCompatActivity
{


    int nParole = 1139;

    String[] words = new String[nParole];

    public void getWords() {
        String db = "a\n" +
                "abbandonare\n" +
                "abbastanza\n" +
                "abitare\n" +
                "abito\n" +
                "accadere\n" +
                "accanto\n" +
                "accendere\n" +
                "accettare\n" +
                "accogliere\n" +
                "accompagnare\n" +
                "accordo\n" +
                "accorgersi\n" +
                "acqua\n" +
                "addirittura\n" +
                "addosso\n" +
                "adesso\n" +
                "affare\n" +
                "affatto\n" +
                "affermare\n" +
                "affrontare\n" +
                "aggiungere\n" +
                "ah\n" +
                "aiutare\n" +
                "aiuto\n" +
                "albergo\n" +
                "albero\n" +
                "alcuno\n" +
                "allontanare\n" +
                "allora\n" +
                "almeno\n" +
                "alto\n" +
                "altro\n" +
                "alzare\n" +
                "amare\n" +
                "ambiente\n" +
                "americano\n" +
                "amico\n" +
                "ammazzare\n" +
                "ammettere\n" +
                "amore\n" +
                "ampio\n" +
                "anche\n" +
                "ancora\n" +
                "andare\n" +
                "angolo\n" +
                "anima\n" +
                "animale\n" +
                "animo\n" +
                "anno\n" +
                "annunciare\n" +
                "antico\n" +
                "anzi\n" +
                "apparire\n" +
                "appartenere\n" +
                "appena\n" +
                "appoggiare\n" +
                "appunto\n" +
                "aprire\n" +
                "argomento\n" +
                "aria\n" +
                "arma\n" +
                "armare\n" +
                "arrestare\n" +
                "arrivare\n" +
                "arte\n" +
                "articolo\n" +
                "ascoltare\n" +
                "aspettare\n" +
                "aspetto\n" +
                "assai\n" +
                "assicurare\n" +
                "assistere\n" +
                "assoluto\n" +
                "assumere\n" +
                "attaccare\n" +
                "atteggiamento\n" +
                "attendere\n" +
                "attento\n" +
                "attenzione\n" +
                "attesa\n" +
                "attimo\n" +
                "attività\n" +
                "atto\n" +
                "attore\n" +
                "attorno\n" +
                "attraversare\n" +
                "attuale\n" +
                "aumentare\n" +
                "automobile\n" +
                "autore\n" +
                "autorità\n" +
                "avanti\n" +
                "avanzare\n" +
                "avere\n" +
                "avvenire\n" +
                "avvertire\n" +
                "avvicinare\n" +
                "avvocato\n" +
                "azione\n" +
                "azzurro\n" +
                "baciare\n" +
                "badare\n" +
                "bagno\n" +
                "bambina\n" +
                "bambino\n" +
                "base\n" +
                "basso\n" +
                "bastare\n" +
                "battaglia\n" +
                "battere\n" +
                "bellezza\n" +
                "bello\n" +
                "bene\n" +
                "bere\n" +
                "bestia\n" +
                "bianco\n" +
                "biondo\n" +
                "bisognare\n" +
                "bisogno\n" +
                "bocca\n" +
                "bosco\n" +
                "braccio\n" +
                "bravo\n" +
                "breve\n" +
                "bruciare\n" +
                "brutto\n" +
                "buio\n" +
                "buono\n" +
                "buttare\n" +
                "cadere\n" +
                "caffè\n" +
                "calcio\n" +
                "caldo\n" +
                "cambiare\n" +
                "camera\n" +
                "camminare\n" +
                "campagna\n" +
                "campo\n" +
                "cane\n" +
                "cantare\n" +
                "capace\n" +
                "capello\n" +
                "capire\n" +
                "capitare\n" +
                "capo\n" +
                "carattere\n" +
                "caratteristico\n" +
                "carne\n" +
                "caro\n" +
                "carta\n" +
                "casa\n" +
                "caso\n" +
                "cattivo\n" +
                "cattolico\n" +
                "causa\n" +
                "cavallo\n" +
                "celebrare\n" +
                "centrale\n" +
                "centro\n" +
                "cercare\n" +
                "certamente\n" +
                "certo\n" +
                "che\n" +
                "chi\n" +
                "chiamare\n" +
                "chiaro\n" +
                "chiave\n" +
                "chiedere\n" +
                "chiesa\n" +
                "chilometro\n" +
                "chissà\n" +
                "chiudere\n" +
                "ci\n" +
                "ciascuno\n" +
                "cielo\n" +
                "cioè\n" +
                "circa\n" +
                "cittadino\n" +
                "città\n" +
                "civile\n" +
                "civiltà\n" +
                "ciò\n" +
                "classe\n" +
                "collina\n" +
                "collo\n" +
                "colore\n" +
                "coloro\n" +
                "colpa\n" +
                "colpire\n" +
                "colpo\n" +
                "come\n" +
                "cominciare\n" +
                "commercio\n" +
                "commissione\n" +
                "comodo\n" +
                "compagnia\n" +
                "compagno\n" +
                "compiere\n" +
                "completamente\n" +
                "comporre\n" +
                "comprare\n" +
                "comprendere\n" +
                "comune\n" +
                "comunicazione\n" +
                "comunque\n" +
                "con\n" +
                "concedere\n" +
                "concetto\n" +
                "concludere\n" +
                "condizione\n" +
                "condurre\n" +
                "confessare\n" +
                "confronto\n" +
                "congresso\n" +
                "conoscenza\n" +
                "conoscere\n" +
                "conseguenza\n" +
                "consentire\n" +
                "conservare\n" +
                "considerare\n" +
                "consiglio\n" +
                "contadino\n" +
                "contare\n" +
                "contatto\n" +
                "contenere\n" +
                "contento\n" +
                "continuare\n" +
                "continuo\n" +
                "conto\n" +
                "contrario\n" +
                "contro\n" +
                "controllo\n" +
                "convincere\n" +
                "coprire\n" +
                "coraggio\n" +
                "corpo\n" +
                "corrente\n" +
                "correre\n" +
                "corsa\n" +
                "corso\n" +
                "cortile\n" +
                "cosa\n" +
                "coscienza\n" +
                "costa\n" +
                "costituire\n" +
                "costringere\n" +
                "costruire\n" +
                "costruzione\n" +
                "creare\n" +
                "credere\n" +
                "crescere\n" +
                "crisi\n" +
                "cristiano\n" +
                "croce\n" +
                "cucina\n" +
                "cui\n" +
                "cultura\n" +
                "cuore\n" +
                "cura\n" +
                "da\n" +
                "dare\n" +
                "davanti\n" +
                "davvero\n" +
                "decidere\n" +
                "decisione\n" +
                "dedicare\n" +
                "denaro\n" +
                "dente\n" +
                "dentro\n" +
                "descrivere\n" +
                "desiderare\n" +
                "desiderio\n" +
                "destino\n" +
                "destro\n" +
                "determinare\n" +
                "di\n" +
                "dichiarare\n" +
                "dietro\n" +
                "difendere\n" +
                "difesa\n" +
                "differenza\n" +
                "difficile\n" +
                "difficoltà\n" +
                "diffondere\n" +
                "dimenticare\n" +
                "dimostrare\n" +
                "dinanzi\n" +
                "dio\n" +
                "dipendere\n" +
                "dire\n" +
                "diretto\n" +
                "direttore\n" +
                "direzione\n" +
                "dirigere\n" +
                "diritto\n" +
                "discorso\n" +
                "discutere\n" +
                "disporre\n" +
                "disposizione\n" +
                "distanza\n" +
                "distinguere\n" +
                "distruggere\n" +
                "dito\n" +
                "divenire\n" +
                "diventare\n" +
                "diverso\n" +
                "divertire\n" +
                "dividere\n" +
                "dolce\n" +
                "dolore\n" +
                "domanda\n" +
                "domandare\n" +
                "domani\n" +
                "domenica\n" +
                "don\n" +
                "donna\n" +
                "dopo\n" +
                "dormire\n" +
                "dottore\n" +
                "dove\n" +
                "dovere\n" +
                "dubbio\n" +
                "dunque\n" +
                "durante\n" +
                "durare\n" +
                "duro\n" +
                "e\n" +
                "eccellenza\n" +
                "eccetera\n" +
                "ecco\n" +
                "economico\n" +
                "effetto\n" +
                "egli\n" +
                "eh\n" +
                "elemento\n" +
                "elettrico\n" +
                "elevare\n" +
                "energia\n" +
                "enorme\n" +
                "entrare\n" +
                "entro\n" +
                "epoca\n" +
                "eppure\n" +
                "erba\n" +
                "errore\n" +
                "esame\n" +
                "escludere\n" +
                "esempio\n" +
                "esercito\n" +
                "esistere\n" +
                "esperienza\n" +
                "esporre\n" +
                "espressione\n" +
                "esprimere\n" +
                "essa\n" +
                "essere\n" +
                "esso\n" +
                "estate\n" +
                "estendere\n" +
                "estero\n" +
                "estremo\n" +
                "età\n" +
                "europeo\n" +
                "evitare\n" +
                "fabbrica\n" +
                "faccia\n" +
                "facile\n" +
                "fame\n" +
                "famiglia\n" +
                "famoso\n" +
                "fantasia\n" +
                "fatica\n" +
                "fatto\n" +
                "favore\n" +
                "fede\n" +
                "felice\n" +
                "fenomeno\n" +
                "ferire\n" +
                "fermare\n" +
                "fermo\n" +
                "ferro\n" +
                "festa\n" +
                "fianco\n" +
                "fiducia\n" +
                "figlia\n" +
                "figlio\n" +
                "figura\n" +
                "figurare\n" +
                "film\n" +
                "filo\n" +
                "finalmente\n" +
                "finché\n" +
                "fine\n" +
                "finestra\n" +
                "finire\n" +
                "fino\n" +
                "fiore\n" +
                "fissare\n" +
                "fiume\n" +
                "foglia\n" +
                "folla\n" +
                "fondare\n" +
                "fondo\n" +
                "forma\n" +
                "formare\n" +
                "fornire\n" +
                "forse\n" +
                "forte\n" +
                "fortuna\n" +
                "forza\n" +
                "fra\n" +
                "francese\n" +
                "frase\n" +
                "fratello\n" +
                "freddo\n" +
                "fresco\n" +
                "fretta\n" +
                "fronte\n" +
                "frutto\n" +
                "fuggire\n" +
                "fumare\n" +
                "funzione\n" +
                "fuoco\n" +
                "fuori\n" +
                "futuro\n" +
                "gamba\n" +
                "gatto\n" +
                "generale\n" +
                "genere\n" +
                "gente\n" +
                "gesto\n" +
                "gettare\n" +
                "giallo\n" +
                "giardino\n" +
                "giocare\n" +
                "gioco\n" +
                "gioia\n" +
                "giornale\n" +
                "giornata\n" +
                "giorno\n" +
                "giovane\n" +
                "giovanotto\n" +
                "girare\n" +
                "giro\n" +
                "giudicare\n" +
                "giudizio\n" +
                "giugno\n" +
                "giungere\n" +
                "giustizia\n" +
                "giusto\n" +
                "già\n" +
                "giù\n" +
                "godere\n" +
                "governo\n" +
                "grado\n" +
                "grande\n" +
                "grave\n" +
                "grazia\n" +
                "grazie\n" +
                "greco\n" +
                "gridare\n" +
                "grigio\n" +
                "grosso\n" +
                "gruppo\n" +
                "guardare\n" +
                "guardia\n" +
                "guerra\n" +
                "guidare\n" +
                "gusto\n" +
                "idea\n" +
                "ieri\n" +
                "immaginare\n" +
                "immagine\n" +
                "imparare\n" +
                "impedire\n" +
                "imporre\n" +
                "importante\n" +
                "importanza\n" +
                "importare\n" +
                "impossibile\n" +
                "impressione\n" +
                "improvviso\n" +
                "in\n" +
                "incontrare\n" +
                "indicare\n" +
                "indietro\n" +
                "industria\n" +
                "industriale\n" +
                "infatti\n" +
                "infine\n" +
                "inglese\n" +
                "iniziare\n" +
                "inizio\n" +
                "innamorare\n" +
                "inoltre\n" +
                "insegnare\n" +
                "insieme\n" +
                "insistere\n" +
                "insomma\n" +
                "intanto\n" +
                "intendere\n" +
                "intenzione\n" +
                "interessante\n" +
                "interessare\n" +
                "interesse\n" +
                "internazionale\n" +
                "interno\n" +
                "intero\n" +
                "intorno\n" +
                "inutile\n" +
                "invece\n" +
                "inverno\n" +
                "invitare\n" +
                "io\n" +
                "isola\n" +
                "istante\n" +
                "istituto\n" +
                "italiano\n" +
                "labbro\n" +
                "lago\n" +
                "lanciare\n" +
                "largo\n" +
                "lasciare\n" +
                "latino\n" +
                "lato\n" +
                "latte\n" +
                "lavorare\n" +
                "lavoro\n" +
                "legare\n" +
                "legge\n" +
                "leggere\n" +
                "leggero\n" +
                "lei\n" +
                "lettera\n" +
                "letto\n" +
                "libro\n" +
                "limitare\n" +
                "limite\n" +
                "linea\n" +
                "lingua\n" +
                "lira\n" +
                "lontano\n" +
                "loro\n" +
                "lotta\n" +
                "luce\n" +
                "lui\n" +
                "luna\n" +
                "lungo\n" +
                "luogo\n" +
                "là\n" +
                "lì\n" +
                "ma\n" +
                "macchina\n" +
                "madre\n" +
                "maestro\n" +
                "magari\n" +
                "maggio\n" +
                "maggiore\n" +
                "malattia\n" +
                "male\n" +
                "mamma\n" +
                "mancare\n" +
                "mandare\n" +
                "mangiare\n" +
                "maniera\n" +
                "mano\n" +
                "mantenere\n" +
                "mare\n" +
                "marito\n" +
                "massa\n" +
                "massimo\n" +
                "materia\n" +
                "matrimonio\n" +
                "mattina\n" +
                "mattino\n" +
                "medesimo\n" +
                "medico\n" +
                "medio\n" +
                "meglio\n" +
                "memoria\n" +
                "meno\n" +
                "mente\n" +
                "mentre\n" +
                "mercato\n" +
                "meritare\n" +
                "merito\n" +
                "mese\n" +
                "messa\n" +
                "mestiere\n" +
                "metro\n" +
                "mettere\n" +
                "metà\n" +
                "mezzo\n" +
                "mi\n" +
                "migliore\n" +
                "milione\n" +
                "militare\n" +
                "minimo\n" +
                "ministro\n" +
                "minore\n" +
                "minuto\n" +
                "mio\n" +
                "misura\n" +
                "moderno\n" +
                "modo\n" +
                "moglie\n" +
                "molto\n" +
                "momento\n" +
                "mondo\n" +
                "montagna\n" +
                "monte\n" +
                "morale\n" +
                "morire\n" +
                "morte\n" +
                "mostrare\n" +
                "motivo\n" +
                "movimento\n" +
                "muovere\n" +
                "muro\n" +
                "musica\n" +
                "nascere\n" +
                "nascondere\n" +
                "natura\n" +
                "naturale\n" +
                "naturalmente\n" +
                "nave\n" +
                "nazionale\n" +
                "nazione\n" +
                "ne\n" +
                "neanche\n" +
                "necessario\n" +
                "necessità\n" +
                "nemico\n" +
                "nemmeno\n" +
                "neppure\n" +
                "nero\n" +
                "nessuno\n" +
                "niente\n" +
                "no\n" +
                "nobile\n" +
                "noi\n" +
                "nome\n" +
                "non\n" +
                "nord\n" +
                "normale\n" +
                "nostro\n" +
                "notare\n" +
                "notevole\n" +
                "notizia\n" +
                "noto\n" +
                "notte\n" +
                "nudo\n" +
                "nulla\n" +
                "numero\n" +
                "numeroso\n" +
                "nuovo\n" +
                "né\n" +
                "o\n" +
                "occasione\n" +
                "occhio\n" +
                "occorrere\n" +
                "odore\n" +
                "offendere\n" +
                "offrire\n" +
                "oggetto\n" +
                "oggi\n" +
                "ogni\n" +
                "ognuno\n" +
                "oh\n" +
                "oltre\n" +
                "ombra\n" +
                "onore\n" +
                "opera\n" +
                "operaio\n" +
                "operazione\n" +
                "opinione\n" +
                "opporre\n" +
                "oppure\n" +
                "ora\n" +
                "oramai\n" +
                "ordinare\n" +
                "ordine\n" +
                "orecchio\n" +
                "organizzare\n" +
                "origine\n" +
                "oro\n" +
                "ospedale\n" +
                "osservare\n" +
                "ottenere\n" +
                "pace\n" +
                "padre\n" +
                "padrone\n" +
                "paese\n" +
                "pagare\n" +
                "pagina\n" +
                "palazzo\n" +
                "pane\n" +
                "papà\n" +
                "parecchio\n" +
                "parere\n" +
                "parete\n" +
                "parlare\n" +
                "parola\n" +
                "parte\n" +
                "partecipare\n" +
                "particolare\n" +
                "partire\n" +
                "partito\n" +
                "passare\n" +
                "passato\n" +
                "passione\n" +
                "passo\n" +
                "patria\n" +
                "paura\n" +
                "pazzo\n" +
                "peccato\n" +
                "peggio\n" +
                "pelle\n" +
                "pena\n" +
                "pensare\n" +
                "pensiero\n" +
                "per\n" +
                "perché\n" +
                "perciò\n" +
                "perdere\n" +
                "perfetto\n" +
                "perfino\n" +
                "pericolo\n" +
                "pericoloso\n" +
                "periodo\n" +
                "permettere\n" +
                "persona\n" +
                "personaggio\n" +
                "personale\n" +
                "però\n" +
                "pesare\n" +
                "peso\n" +
                "pezzo\n" +
                "piacere\n" +
                "piangere\n" +
                "piano\n" +
                "pianta\n" +
                "piantare\n" +
                "pianura\n" +
                "piazza\n" +
                "piccolo\n" +
                "piede\n" +
                "pieno\n" +
                "pietra\n" +
                "pietà\n" +
                "piuttosto\n" +
                "più\n" +
                "poco\n" +
                "poesia\n" +
                "poeta\n" +
                "poiché\n" +
                "politica\n" +
                "politico\n" +
                "polizia\n" +
                "pomeriggio\n" +
                "ponte\n" +
                "popolazione\n" +
                "popolo\n" +
                "porre\n" +
                "porta\n" +
                "portare\n" +
                "porto\n" +
                "posare\n" +
                "posizione\n" +
                "possedere\n" +
                "possibile\n" +
                "possibilità\n" +
                "posto\n" +
                "potenza\n" +
                "potere\n" +
                "povero\n" +
                "pranzo\n" +
                "prato\n" +
                "preciso\n" +
                "preferire\n" +
                "pregare\n" +
                "prendere\n" +
                "preoccupare\n" +
                "preparare\n" +
                "presentare\n" +
                "presente\n" +
                "presenza\n" +
                "presidente\n" +
                "presso\n" +
                "presto\n" +
                "prevedere\n" +
                "prezzo\n" +
                "prima\n" +
                "primo\n" +
                "principale\n" +
                "principe\n" +
                "principio\n" +
                "privato\n" +
                "probabilmente\n" +
                "problema\n" +
                "procedere\n" +
                "processo\n" +
                "prodotto\n" +
                "produrre\n" +
                "produzione\n" +
                "professore\n" +
                "profondo\n" +
                "programma\n" +
                "promettere\n" +
                "pronto\n" +
                "proporre\n" +
                "proposito\n" +
                "proposta\n" +
                "proprio\n" +
                "prossimo\n" +
                "prova\n" +
                "provare\n" +
                "provincia\n" +
                "provocare\n" +
                "provvedere\n" +
                "pubblicare\n" +
                "pubblico\n" +
                "punta\n" +
                "punto\n" +
                "pure\n" +
                "puro\n" +
                "qua\n" +
                "quadro\n" +
                "qualche\n" +
                "qualcosa\n" +
                "qualcuno\n" +
                "quale\n" +
                "qualità\n" +
                "qualsiasi\n" +
                "qualunque\n" +
                "quanto\n" +
                "quarto\n" +
                "quasi\n" +
                "quello\n" +
                "questione\n" +
                "questo\n" +
                "qui\n" +
                "quindi\n" +
                "raccogliere\n" +
                "raccontare\n" +
                "ragazza\n" +
                "ragazzo\n" +
                "raggiungere\n" +
                "ragione\n" +
                "rapido\n" +
                "rapporto\n" +
                "rappresentare\n" +
                "reale\n" +
                "realtà\n" +
                "recare\n" +
                "recente\n" +
                "regione\n" +
                "regno\n" +
                "relazione\n" +
                "religioso\n" +
                "rendere\n" +
                "repubblica\n" +
                "resistere\n" +
                "restare\n" +
                "resto\n" +
                "ricchezza\n" +
                "ricco\n" +
                "ricerca\n" +
                "ricevere\n" +
                "richiedere\n" +
                "riconoscere\n" +
                "ricordare\n" +
                "ricordo\n" +
                "ridere\n" +
                "ridurre\n" +
                "riempire\n" +
                "rientrare\n" +
                "riferire\n" +
                "rifiutare\n" +
                "riguardare\n" +
                "rimanere\n" +
                "rimettere\n" +
                "ringraziare\n" +
                "ripetere\n" +
                "riportare\n" +
                "riprendere\n" +
                "risolvere\n" +
                "rispetto\n" +
                "rispondere\n" +
                "risposta\n" +
                "risultare\n" +
                "risultato\n" +
                "ritenere\n" +
                "ritornare\n" +
                "ritorno\n" +
                "ritrovare\n" +
                "riunire\n" +
                "riuscire\n" +
                "riva\n" +
                "rivedere\n" +
                "rivelare\n" +
                "rivolgere\n" +
                "rivoluzione\n" +
                "roba\n" +
                "romano\n" +
                "rompere\n" +
                "rosso\n" +
                "russo\n" +
                "sacrificio\n" +
                "sacro\n" +
                "sala\n" +
                "salire\n" +
                "saltare\n" +
                "salutare\n" +
                "salvare\n" +
                "sangue\n" +
                "sapere\n" +
                "sbagliare\n" +
                "scala\n" +
                "scappare\n" +
                "scegliere\n" +
                "scena\n" +
                "scendere\n" +
                "scherzare\n" +
                "scienza\n" +
                "scomparire\n" +
                "scopo\n" +
                "scoppiare\n" +
                "scoprire\n" +
                "scorrere\n" +
                "scrittore\n" +
                "scrivere\n" +
                "scuola\n" +
                "scusare\n" +
                "se\n" +
                "secolo\n" +
                "secondo\n" +
                "sede\n" +
                "sedere\n" +
                "segnare\n" +
                "segno\n" +
                "segretario\n" +
                "segreto\n" +
                "seguire\n" +
                "seguito\n" +
                "sembrare\n" +
                "semplice\n" +
                "senso\n" +
                "sentimento\n" +
                "sentire\n" +
                "senza\n" +
                "sera\n" +
                "sereno\n" +
                "serie\n" +
                "serio\n" +
                "servire\n" +
                "servizio\n" +
                "settimana\n" +
                "sforzo\n" +
                "sguardo\n" +
                "si\n" +
                "sicurezza\n" +
                "sicuro\n" +
                "signora\n" +
                "signore\n" +
                "signorina\n" +
                "silenzio\n" +
                "simile\n" +
                "sinistro\n" +
                "sino\n" +
                "sistema\n" +
                "situazione\n" +
                "smettere\n" +
                "sociale\n" +
                "società\n" +
                "soffrire\n" +
                "sognare\n" +
                "sogno\n" +
                "soldato\n" +
                "sole\n" +
                "solito\n" +
                "solo\n" +
                "soltanto\n" +
                "soluzione\n" +
                "sonno\n" +
                "sopra\n" +
                "soprattutto\n" +
                "sorella\n" +
                "sorgere\n" +
                "sorprendere\n" +
                "sorridere\n" +
                "sorriso\n" +
                "sostenere\n" +
                "sottile\n" +
                "sotto\n" +
                "spalla\n" +
                "spazio\n" +
                "speciale\n" +
                "specie\n" +
                "spegnere\n" +
                "spesa\n" +
                "spesso\n" +
                "spettacolo\n" +
                "spingere\n" +
                "spirito\n" +
                "sposare\n" +
                "stabilire\n" +
                "staccare\n" +
                "stagione\n" +
                "stamattina\n" +
                "stampa\n" +
                "stanco\n" +
                "stanza\n" +
                "stasera\n" +
                "stato\n" +
                "stazione\n" +
                "stella\n" +
                "stesso\n" +
                "storia\n" +
                "storico\n" +
                "strada\n" +
                "straniero\n" +
                "strano\n" +
                "straordinario\n" +
                "stringere\n" +
                "strumento\n" +
                "studiare\n" +
                "studio\n" +
                "stupido\n" +
                "su\n" +
                "subito\n" +
                "succedere\n" +
                "successo\n" +
                "sud\n" +
                "suo\n" +
                "suonare\n" +
                "superare\n" +
                "superiore\n" +
                "svegliare\n" +
                "sviluppo\n" +
                "svolgere\n" +
                "sì\n" +
                "tacere\n" +
                "tagliare\n" +
                "tale\n" +
                "tanto\n" +
                "tardi\n" +
                "tavola\n" +
                "tavolo\n" +
                "teatro\n" +
                "tecnico\n" +
                "tedesco\n" +
                "temere\n" +
                "tempo\n" +
                "tendere\n" +
                "tenere\n" +
                "termine\n" +
                "terreno\n" +
                "territorio\n" +
                "terzo\n" +
                "testa\n" +
                "tipo\n" +
                "tirare\n" +
                "titolo\n" +
                "toccare\n" +
                "togliere\n" +
                "tono\n" +
                "tra\n" +
                "tranquillo\n" +
                "trarre\n" +
                "trascinare\n" +
                "tratto\n" +
                "treno\n" +
                "triste\n" +
                "troppo\n" +
                "trovare\n" +
                "tu\n" +
                "tuo\n" +
                "tuttavia\n" +
                "tutto\n" +
                "uccidere\n" +
                "udire\n" +
                "ufficiale\n" +
                "ufficio\n" +
                "uguale\n" +
                "ultimo\n" +
                "umano\n" +
                "unico\n" +
                "unire\n" +
                "università\n" +
                "uno\n" +
                "uomo\n" +
                "uscire\n" +
                "uso\n" +
                "utile\n" +
                "valere\n" +
                "valle\n" +
                "valore\n" +
                "vario\n" +
                "vasto\n" +
                "vecchio\n" +
                "vedere\n" +
                "vendere\n" +
                "venire\n" +
                "vento\n" +
                "veramente\n" +
                "verde\n" +
                "verità\n" +
                "vero\n" +
                "verso\n" +
                "vestire\n" +
                "vestito\n" +
                "vi\n" +
                "via\n" +
                "viaggio\n" +
                "vicino\n" +
                "villa\n" +
                "vincere\n" +
                "vino\n" +
                "visita\n" +
                "viso\n" +
                "vista\n" +
                "vita\n" +
                "vivere\n" +
                "vivo\n" +
                "voce\n" +
                "voglia\n" +
                "voi\n" +
                "volare\n" +
                "volere\n" +
                "volgere\n" +
                "volontà\n" +
                "volto\n" +
                "vostro\n" +
                "vuoto\n" +
                "zia\n" +
                "zio\n" +
                "zitto\n" +
                "zona";

                words = db.split("\n");
        }

    public String getRandom()
    {
        Random r = new Random();
        int ranNum= r.nextInt(nParole);
        return words[ranNum];
    }



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rWord = findViewById(R.id.button);
        TextView t1 = findViewById(R.id.textView1);
        TextView t2 = findViewById(R.id.textView2);
        TextView t3 = findViewById(R.id.textView3);
        TextView t4 = findViewById(R.id.textView4);
        TextView timerBox = findViewById(R.id.timerBox);

        CountDownTimer cdTimer = new CountDownTimer(80000, 1000)
    {
        @Override
        public void onTick(long millisUntilFinished)
        {
            timerBox.setText("" + ((millisUntilFinished/1000)+1));
        }

        @Override
        public void onFinish()
        {
            timerBox.setText("STOP");
        }
    };


        getWords();

        rWord.setOnClickListener(v ->
        {
            t1.setText(getRandom());
            t2.setText(getRandom());
            t3.setText(getRandom());
            t4.setText(getRandom());

            cdTimer.start();
        });
    }


}
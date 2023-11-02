/*Jane valgte for nyligt at lade sin mand John prøve at implementere en generel struktur for de
forskellige kø-systemer, der skal implementeres som følge af den nye digitaliseringsstrategi i Doe
& the Snacks. Som eksempel nævnte hun for John, at snackbodernes røgeri behandler de ferske
menneskelemmer i en kø-struktur, og John implementerede følgelig en SnackQueue, der også
evt. kunne bruges til kø-behandling af Pez og Smarties. Jane havde imidlertid glemt at nævne, at
kø-datastrukturen også skal bruges til genopfyldning af Club-Mate flasker. Implementer en ny
generisk Queue<T>, der kan imødekomme alle fremtidige scenarier i virksomheden.*/


import java.util.ArrayList;
import java.util.List;

public class Queue<T>{

    private List<T> queueList = new ArrayList<>();

    public void enqueue(T element){
        queueList.add(element);
    }

    public T dequeue(){
        if(isEmpty()){
            throw new IllegalStateException("Queue is empty");
        }
        T element = queueList.get(0);
        queueList.remove(0);


        return element;
    }

    public T peek(){
        if(isEmpty()){
            throw new IllegalStateException("Queue is empty");
        }
        return queueList.get(0);
    }
    public boolean isEmpty(){
        return queueList.size() == 0;
    }

    public int count(){
        return queueList.size();
    }
}

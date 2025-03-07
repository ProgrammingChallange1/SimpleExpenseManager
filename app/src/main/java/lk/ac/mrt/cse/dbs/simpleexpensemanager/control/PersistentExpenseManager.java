package lk.ac.mrt.cse.dbs.simpleexpensemanager.control;

import android.content.Context;

import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.AccountDAO;
import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.TransactionDAO;
import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.impl.PersistentAccountDAO;
import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.impl.PersistentTransactionDAO;
/**
 * Created by Lahiru Sandeepa on 12/7/2015.
 */
public class PersistentExpenseManager extends ExpenseManager{

    private Context context = null;

    //Constructor
    public PersistentExpenseManager( Context context) {
        this.context = context;
        setup();
    }


    public void setup()  {

        //Setup AccountDAO object
        AccountDAO persistentAccountDAO = new PersistentAccountDAO(context);
        setAccountsDAO(persistentAccountDAO);

        //Setup TransactionDAO object
        TransactionDAO persistentTransactionDAO = new PersistentTransactionDAO(context);
        setTransactionsDAO(persistentTransactionDAO);

    }
}
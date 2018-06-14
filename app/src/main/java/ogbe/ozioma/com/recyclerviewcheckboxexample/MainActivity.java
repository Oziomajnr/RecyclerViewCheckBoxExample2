package ogbe.ozioma.com.recyclerviewcheckboxexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public RecyclerView recyclerView;
    private Adapter adapter;
    private LinearLayoutManager layoutManager;

    // dummy list of items to be populated manually
    List<Model> items = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        Adapter adapter = new Adapter();
        layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

        fillItems();

        adapter.loadItems(items);
    }
    private void fillItems() {
        for (int x = 0; x <=100; x++) {
            Model model = new Model();
            model.setPosition(x+1);

            items.add(model);
        }
    }
}

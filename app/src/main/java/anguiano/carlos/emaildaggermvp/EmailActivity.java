package anguiano.carlos.emaildaggermvp;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import javax.inject.Inject;

import anguiano.carlos.emaildaggermvp.model.CityListResponse;
import anguiano.carlos.emaildaggermvp.networking.ServiceNetwork;


public class EmailActivity extends BaseApp implements EmailView {
    //https://jsonplaceholder.typicode.com/posts/1/comments
    private RecyclerView recyclerView;
    private ProgressBar progressBar;
    @Inject
    public ServiceNetwork serviceNetwork;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getDeps().inject(this);
        initViewActivity();
        EmailPresenter presenter = new EmailPresenter(this, serviceNetwork);
        presenter.getListModel();
    }


    private void initViewActivity() {
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.reciclerView);
        progressBar = findViewById(R.id.progressBar);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public void showWait() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void removeWait() {
        progressBar.setVisibility(View.GONE);
    }

    @Override
    public void getListSuccess(CityListResponse response) {
        String email = response.getMessage();
        Toast.makeText(this, "" + email, Toast.LENGTH_SHORT).show();
        /*EmailAdapter adapter = new EmailAdapter(getApplicationContext(), response.getEmail(), new EmailAdapter.OnItemClickListener() {
            @Override
            public void onClickItem(ItemsTest itemsTest) {
                Toast.makeText(EmailActivity.this, "" + itemsTest.getEmail(), Toast.LENGTH_SHORT).show();
            }
        });
        recyclerView.setAdapter(adapter);*/
    }

    @Override
    public void onFailure(String appErrorMessage) {

    }

//    private void initObject() {
//        ItemsTest itemsTest1 = new ItemsTest();
//        itemsTest1.setPostId("----AAA----1A");
//        itemsTest1.setId("----AAA----1A");
//        itemsTest1.setName("----AAA----id labore ex et quam laborum");
//        itemsTest1.setEmail("----AAA----Eliseo@gardner.biz");
//        itemsTest1.setBody("----AAA----laudantium enim quasi est quidem magnam voluptate ipsam eosntempora quo necessitatibusndolor quam autem quasinreiciendis et nam sapiente accusantium");
//        itemsTestsList.add(itemsTest1);
//
//        ItemsTest itemsTest2 = new ItemsTest();
//        itemsTest2.setPostId("----BBB----1");
//        itemsTest2.setId("----BBB----2");
//        itemsTest2.setName("----BBB----quo vero reiciendis velit similique earum");
//        itemsTest2.setEmail("----BBB----Jayne_Kuhic@sydney.com");
//        itemsTest2.setBody("----BBB----laudantium enim quasi est quidem magnam voluptate ipsam eosntempora quo necessitatibusndolor quam autem quasinreiciendis et nam sapiente accusantium");
//        itemsTestsList.add(itemsTest2);
//
//        ItemsTest itemsTest3 = new ItemsTest();
//        itemsTest3.setPostId("----CCC----1");
//        itemsTest3.setId("----CCC----2");
//        itemsTest3.setName("----CCC----quo vero reiciendis velit similique earum");
//        itemsTest3.setEmail("----CCC----Jayne_Kuhic@sydney.com");
//        itemsTest3.setBody("----CCC----laudantium enim quasi est quidem magnam voluptate ipsam eosntempora quo necessitatibusndolor quam autem quasinreiciendis et nam sapiente accusantium");
//        itemsTestsList.add(itemsTest3);
//
//        ItemsTest itemsTest4 = new ItemsTest();
//        itemsTest4.setPostId("----DDD----1");
//        itemsTest4.setId("----DDD----2");
//        itemsTest4.setName("----DDD----quo vero reiciendis velit similique earum");
//        itemsTest4.setEmail("----DDD----Jayne_Kuhic@sydney.com");
//        itemsTest4.setBody("----DDD----laudantium enim quasi est quidem magnam voluptate ipsam eosntempora quo necessitatibusndolor quam autem quasinreiciendis et nam sapiente accusantium");
//        itemsTestsList.add(itemsTest4);
//
//        ItemsTest itemsTest5 = new ItemsTest();
//        itemsTest5.setPostId("----EEE----1");
//        itemsTest5.setId("----EEE----2");
//        itemsTest5.setName("----EEE----quo vero reiciendis velit similique earum");
//        itemsTest5.setEmail("----EEE----Jayne_Kuhic@sydney.com");
//        itemsTest5.setBody("----EEE----laudantium enim quasi est quidem magnam voluptate ipsam eosntempora quo necessitatibusndolor quam autem quasinreiciendis et nam sapiente accusantium");
//        itemsTestsList.add(itemsTest5);
//    }

}

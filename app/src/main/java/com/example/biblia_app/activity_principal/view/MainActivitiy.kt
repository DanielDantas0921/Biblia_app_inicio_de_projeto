package com.example.biblia_app.activity_principal.view

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.*
import com.example.biblia_app.R
import com.example.biblia_app.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationView


class MainActivitiy : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var appBarConfiguration: AppBarConfiguration


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

//        val toolbar = findViewById<Toolbar>(R.id.toolbar)
//
//        setSupportActionBar(binding.appBarMain.toolbar)
//
//
//        val drawerLayout: DrawerLayout = binding.drawerLayout
//        val navView: NavigationView = binding.navView
//        val navHostFragment =
//            supportFragmentManager.findFragmentById(R.id.main_nav_host) as NavHostFragment?
//        val navController = navHostFragment?.navController
//
//        appBarConfiguration = AppBarConfiguration(
//            setOf(
//                R.id.nav_home,
//                R.id.nav_activity_bibly,
//                R.id.nav_activity_preferences,
//                R.id.nav_fragment_about
//            ),
//            drawerLayout
//        )
//
//        val appBarConfiguration1 =
//            AppBarConfiguration(setOf(R.id.nav_home, R.id.nav_fragment_about))
//
//        if (navController?.graph != null) {
//            val appBarConfiguration = AppBarConfiguration(navController.graph)
//            val appBarConfiguration2 =
//                AppBarConfiguration(setOf(R.id.nav_home, R.id.nav_fragment_about))
//            findViewById<Toolbar>(R.id.toolbar)
//                .setupWithNavController(navController, appBarConfiguration2)
//        }

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        val drawerLayout = findViewById<DrawerLayout>(R.id.drawer_layout)
        val navView = findViewById<NavigationView>(R.id.nav_view)


        val navController = findNavController(R.id.main_nav_host)




        appBarConfiguration = AppBarConfiguration(
            setOf(R.id.nav_fragment_home, R.id.nav_fragment_about), drawerLayout
        )


        setupActionBarWithNavController(navController,appBarConfiguration)
        navView.setupWithNavController(navController)
    }


    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.main_nav_host)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }

}



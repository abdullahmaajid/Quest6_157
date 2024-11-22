package com.example.navigasidengandata.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navigasidengandata.ui.view.screen.MahasiswaFormView
import com.example.navigasidengandata.ui.view.screen.RencanaStudyView
import com.example.navigasidengandata.ui.view.screen.SplashView
import com.example.navigasidengandata.ui.view.screen.TampilView
import com.example.navigasidengandata.ui.view.viewmodel.MahasiswaViewModel
import com.example.navigasidengandata.ui.view.viewmodel.RencanaStudyViewModel

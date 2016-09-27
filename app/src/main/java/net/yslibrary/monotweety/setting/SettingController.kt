package net.yslibrary.monotweety.setting

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import net.yslibrary.monotweety.R
import net.yslibrary.monotweety.base.ActionBarController
import net.yslibrary.monotweety.base.HasComponent

/**
 * Created by yshrsmz on 2016/09/24.
 */
class SettingController : ActionBarController(), HasComponent<SettingComponent> {

  override val component: SettingComponent by lazy {
    getComponentProvider<SettingComponent.ComponentProvider>(activity)
        .settingComponent(SettingViewModule())
  }

  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup): View {
    val view = inflater.inflate(R.layout.controller_setting, container, false)

    component.inject(this)

    return view
  }
}
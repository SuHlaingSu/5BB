package com.fivebb.selfcare.mvp.views

import android.content.Context
import com.fivebb.shared.mvp.views.BaseView

interface SecretQuestionView: BaseView {

    fun getContext() : Context

    fun readySecretQuestion()

    fun correctSecretQuestion(message: String)
}
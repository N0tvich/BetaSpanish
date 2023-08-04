package com.n0tvich

import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin
import android.content.Context
import com.stormunblessed.JKAnimeProvider

@CloudstreamPlugin
class JKAnimeProviderPlugin: Plugin() {
    override fun load(context: Context) {
        // All providers should be added in this manner. Please don't edit the providers list directly.
        registerMainAPI(JKAnimeProvider())
    }
}
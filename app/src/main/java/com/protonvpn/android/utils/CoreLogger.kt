/*
 * Copyright (c) 2020 Proton Technologies AG
 *
 * This file is part of ProtonVPN.
 *
 * ProtonVPN is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * ProtonVPN is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with ProtonVPN.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.protonvpn.android.utils

import com.protonvpn.android.BuildConfig
import me.proton.core.util.kotlin.Logger

class CoreLogger : Logger {

    override fun e(tag: String, msg: String?, e: Throwable?) {
        msg?.let { ProtonLogger.log("[$tag] $msg") }
        e?.let { ProtonLogger.log(e.toString()) }
        if (BuildConfig.DEBUG)
            e?.printStackTrace()
    }

    override fun i(tag: String, msg: String) {
        ProtonLogger.log("[$tag] $msg")
    }
}

package io.ktor.client.engine.android

import io.ktor.client.call.*
import io.ktor.client.request.*
import io.ktor.http.*
import io.ktor.http.content.*
import io.ktor.util.*
import kotlinx.coroutines.experimental.*

internal class AndroidHttpRequest(override val call: HttpClientCall, data: HttpRequestData) : HttpRequest {
    override val url: Url = data.url
    override val content: OutgoingContent = data.body as OutgoingContent
    override val executionContext: Job = data.executionContext
    override val headers: Headers = data.headers
    override val method: HttpMethod = data.method

    override val attributes: Attributes = data.attributes
}
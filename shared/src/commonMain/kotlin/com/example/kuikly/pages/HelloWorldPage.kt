package com.example.kuikly.pages

import com.tencent.kuikly.core.annotations.Page
import com.tencent.kuikly.core.base.ViewBuilder
import com.tencent.kuikly.core.pager.Pager
import com.tencent.kuikly.core.views.Text

@Page("HelloWorld")
internal class HelloWorldPage : Pager() {
    override fun created() {
        super.created()
//        val pgData = pageData;
    }

    override fun pageDidAppear() {
        super.pageDidAppear()
    }

    override fun pageDidDisappear() {
        super.pageDidDisappear()
    }

    override fun pageWillDestroy() {
        super.pageWillDestroy()
    }

    override fun body(): ViewBuilder {
        return {
            attr {
                allCenter()
            }

            Text {
                attr {
                    text("hello kuikly")
                    fontSize(14f)
                }
            }
        }
    }
}
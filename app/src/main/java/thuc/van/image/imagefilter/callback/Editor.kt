package thuc.van.image.imagefilter.callback

import thuc.van.image.imagefilter.callback.Snapshot

interface Editor {
    fun createSnapshot() : Snapshot
}
package thuc.van.image.imagefilter

import thuc.van.image.imagefilter.callback.Snapshot

class Commander {
    private val mementos: MutableMap<String, Snapshot> = mutableMapOf()

    fun saveMemento(originatorId: String, memento: Snapshot) {
        mementos[originatorId] = memento
    }
    fun restoreMemento(originatorId: String): Snapshot? {
        return mementos[originatorId]
    }

    companion object{
        const val STICKERS_ORIGINATOR_ID = "STICKERS_ORIGINATOR_ID"
    }
}
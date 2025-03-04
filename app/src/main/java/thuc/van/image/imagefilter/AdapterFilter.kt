package thuc.van.image.imagefilter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import thuc.van.image.imagefilter.databinding.ItemFilterBinding

class AdapterFilter(val onClickItem: (item: FilterModel) -> Unit) :
    RecyclerView.Adapter<AdapterFilter.ViewHolder>() {
    private lateinit var binding: ItemFilterBinding

    val listItem = mutableListOf<FilterModel>()

    @SuppressLint("NotifyDataSetChanged")
    fun submitData(newData: List<FilterModel>) {
        listItem.clear()
        listItem.addAll(newData)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        binding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context), R.layout.item_filter, parent, false
        )

        return ViewHolder(binding, onClickItem)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindData(listItem[position])
    }

    override fun getItemCount() = listItem.size

    class ViewHolder(
        private val binding: ItemFilterBinding,
        val onClickItem: (item: FilterModel) -> Unit
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bindData(item: FilterModel) {
            Glide.with(binding.root).load("file:///android_asset/${item.lutPath}")
                .into(binding.imvFilter)

            binding.root.setOnClickListener {
                onClickItem(item)
            }
        }
    }
}
package id.go.kulonprogokab.belajarrecycleview

class Adapter(private val list:ArrayList<Users>) : RecyclerView.Adapter<Adapter.Holder>(){
    override fun onCreateViewHolder (parent: ViewGroup, viewType: Int) : Holder {
        return Holder(LayoutInflater.from(parent.context).inflate(R.layout.list,parent,false))
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder (holder: Holder, position: Int){
        holder.view.IBLIst.text = list.get(position).name
    }

    class Holder (val view: View) : RecyclerView.ViewHolder(view)
}
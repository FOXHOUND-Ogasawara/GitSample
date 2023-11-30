$(function(){
  $("table").hide();
  $('button').on('click',function(){
    $.ajax({
      type: "get",
      url: "user.json",
      dataType: "json"
    }).done(function(data){
        $("button").hide();

        var list = '';
        for (var i in data) {
            list+= "<tr><td>"+data[i].name+"</td><td>"+data[i].old+"</td></tr>";
        }
        $('#userTable').find('tbody').append(list);
        $("table").show();
    }).fail(function(data){
        console.log(data);
    });
  });
})
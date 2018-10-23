<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title></title>
 <meta charset="utf-8" />
</head>
<body>
    <input type="text" id="userid" width="500" style="width:100%;" placeholder="Input User ID" value="AAAA">
    <input type="text" id="message" width="500" style="width:100%;" placeholder="Input Message.">
    <br>
    <input type="button" id="btnSend" value="Send" style="width:100%;" />
    <br />
    <ul id="discussion"></ul>
    
    <script src="http://demo.dongledongle.com/Scripts/jquery-1.10.2.min.js"></script>
    <script src="http://demo.dongledongle.com/Scripts/jquery.signalR-2.2.1.min.js"></script>

    <script type="text/javascript">
        var connection = $.hubConnection('http://demo.dongledongle.com/');
        var chat = connection.createHubProxy('chatHub');

        $(document).ready(function () {

            chat.on('addNewMessageToPage', function (name, message) {
                $('#discussion').append('<li><strong>' + htmlEncode(name) + '</strong>: ' + htmlEncode(message) + '</li>');
            });

            $('#message').focus();

            connection.start({ jsonp: true }).done(function () {

                $('#btnSend').click(function () {
                    chat.invoke('send', $('#userid').val(), $('#message').val());
                    $('#message').val('').focus();
                });
            });
        });

        function htmlEncode(value) {
            var encodedValue = $('<div />').text(value).html();
            return encodedValue;
        }
    </script>

</body>
</html>
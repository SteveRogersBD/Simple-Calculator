<h1>Learnt how to add a splash screen</h1>
Thread thread = new Thread(){
            public void run(){
                try{
                    sleep(2000);
                }
                catch(Exception e){
                    e.printStackTrace();
                }
                finally{
                    Intent intent = new Intent(SplashActivity2.this, MainActivity.class);
                    startActivity(intent);
                    finish(); //have to finish the thread or else when the user presses the back btn
                }               //the thread will start again
            }
        }; thread.start();

<h1>setOnClickListener</h1>

add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstValue, secondValue, result;
                firstValue = Integer.parseInt(input1.getText().toString());
                secondValue = Integer.parseInt(input2.getText().toString());
                result = (firstValue+secondValue);
                output.setText("Ans is "+result);
            }
        });

const calculator = document.querySelector('.calculator');
    const keys = calculator.querySelector('.calculator__keys');
    const display = document.querySelector('.calculator__display');

    keys.addEventListener('click', e => {
        if (e.target.matches('button')) {
            // Do something
            const key = e.target;
            const action = key.dataset.action;
            const keyContent = key.textContent;
            const displayedNum = display.textContent;



            Array.from(key.parentNode.children)
                .forEach(k => k.classList.remove('is-depressed'));


            if (!action) {
                console.log('number key!');
                if (displayedNum === '0' || calculator.dataset.previousKeyType === 'operator') {
                    display.textContent = keyContent;



                } else {
                    display.textContent = displayedNum + keyContent;


                }
                calculator.dataset.previousKeyType = 'number';
            }

            if (
                action === 'add' ||
                action === 'subtract' ||
                action === 'multiply' ||
                action === 'divide'
            ) {
                console.log('operator key!');
                key.classList.add('is-depressed');
                calculator.dataset.previousKeyType = 'operator';
                calculator.dataset.firstValue = displayedNum;
                calculator.dataset.operator = action;


            }

            if (action === 'decimal') {

                let k =calculator.dataset.previousKeyType;
                console.log(k);
                if  (!displayedNum.includes('.') && k!='operator' ){
                    display.textContent = displayedNum + '.';
                } else if (k == 'operator') {

                    display.textContent = '0.';
                }
                 calculator.dataset.previousKeyType = 'decimal';
            }

            if (action === 'clear') {
                console.log('clear key!');
                display.textContent="0";
                calculator.dataset.previousKeyType = 'clear';
            }

            if (action === 'calculate') {
                console.log('equal key!');
                const firstValue = calculator.dataset.firstValue;
                const operator = calculator.dataset.operator;
                const secondValue = displayedNum;

                if(firstValue!= undefined && operator !=undefined){
                    display.textContent = calculate(firstValue, operator, secondValue);
                    calculator.dataset.previousKeyType = 'calculate';
                }


            }

        }
    });



    function calculate(firstNum,operator,secondNum){
        if(operator === 'add'){
            return parseFloat(firstNum) +parseFloat(secondNum) ;
        }
        if(operator === 'subtract'){
            return parseFloat(firstNum) - parseFloat(secondNum) ;
        }
        if(operator === 'multiply'){
            return parseFloat(firstNum) *parseFloat(secondNum) ;
        }
        if(operator === 'divide'){
            return parseFloat(firstNum) /parseFloat(secondNum) ;
        }
    }
//========================================================
// const calculator = document.querySelector('.calculator');
// const keys = calculator.querySelector('.calculator_keys');
// const display = document.querySelector('.calculator_display')
// keys.addEventListener('click',e =>{ 
//     if(e.target.matches('button')){ 
//         const key = e.target;
//         const action = key.dataset.action;
//         const keyContent = key.textContent
//          const displayedNum = display.textContent
//         Array.from(key.parentNode.children)
//         .forEach(k => k.classList.remove('is-depressed'));
//         if(!action){ 
//             console.log('number key!');
//             if(displayedNum ==='0'|| calculator.dataset.previouskeyType ==='operator'){ 
//                 display.textContent = keyContent;

//             }
//             else{ 
//                 display.textContent = displayedNum +keyContent;
//             }
//             calculator.dataset.previouskeyType = 'number';
        
//     }
//         if(action ==='add'
//             || action==='subtract'
//             || action ==='multiply'
//             ||action==='divide'){ 
//                 console.log('operator keys!');
//                 key.classList.add('is-depressed');
//                 calculator.dataset.previousKeyType =  'operator';
//                 calculator.dataset.firstValue = 'displayedNum';
//                 calculator.dataset.operator = action;
//         }
// if(action ==='decimal'){ 
//     let k = calculator.dataset.previouskeyType;
//     console.log(k);
//     if(!displayedNum.includes('.')&&k!='operator'){ 
//         display.textContent=displayedNum+'.';

//     }
//     else if(k=='operator'){
//         display.textContent ='0.';
//     }
//         calculator.dataset.previouskeyType='decimal';
//     }
//     if(action==='clear'){ 
//     console.log('equal key!');
//     display.textContent="0";
//     calculator.dataset.previouskeyType='clear';
// }
// if(action==='calculate'){ 
//     console.log('equal key!');
//     const firstValue = calculator.dataset.firstValue;
//     const operator = calculator.dataset.operator;
//     const secondValue = displayedNum;
//     if(firstValue != undefined && operator!= undefined){ 
//         display.textContent = calculate(firstValue, operator, secondValue);
//         calculator.dataset.previouskeyType= 'calculate'
//     }
// }
// }
// });
// function calculate(firstNum, operator,secondNum){ 
//     if(operator ==='add'){ 
//         return parseFloat(firstNum)+ parseFloat(secondNum);
//     }
//     if(operator==='subtract'){ 
//         return parseFloat(firstNum)- parseFloat(secondNum);
//     }
//     if(operator==='multiply'){ 
//         return parseFloat(firstNum)* parseFloat(secondNum);
//     }
//     if(operator==='divide'){ 
//         return parseFloat(firstNum)/ parseFloat(secondNum);
//     }
// }
//========================================================================
//         if(action ==='add'
// || action==='subtract'
// || action ==='multiply'||action==='divide'){ 
//     key.classList.add('is-depressed')
//     calculator.dataset.previousKeyType =  'operator'
// }

//     }
// })
// const key = e.target;
// const action = key.dataset.action;
// if(!action){ 
//     console.log('number keys!');
// }
// if(action ==='add'
// || action==='subtract'
// || action ==='multiply'||action==='divide'){ 
//     console.log('operator keys!');
// }
// if(actions ==='decimal'){ 
//     console.log('decimal keys!');
// }
// if(action === 'clear'){ 
//     console.log ('clear keys!');
// }
// if(action=='calculator'){ 
//     console.log('equal key!');
// }
// const display = document.querySelector('.calculator_display')
// keys.addEventListener('click',e =>{ 
//     if(e.target.matches('button')){
//     const key = e.target
//     const action = key.dataset.action
//     const keyContent = key.textContent
//     const displayedNum = display.textContent
// }
// })
// if(!action){ 
//     if(displayedNum ==='0'){ 
//         display.textContent = keyContent
//     }
//     else{ 
//         display.textContent = displayedNum +keyContent
//     }

// }
// if(action ==='decimal'){ 
//     display.textContent = displayedNum+'.';
// }

// keys.addEventListener('click',e =>{ 
//     if(e.target.matches('button')){ 
//         const key =e.target
//         Array.from(key.parentNode.children).forEach(k => k.classList.remove('is-depressed'));
//     }
// })
// if(displayedNum ==='0'|| calculator.dataset.previousKeyType==='operator'){ 
//     display.textContent = textContent;
//     calculator.dataset.previousKeyType="";
// }
// else{
//     display.textContent = displayedNum + keyContent;
//     calculator.dataset.previousKeyType = "";
// }
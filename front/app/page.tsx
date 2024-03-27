import axios from "axios";
import { useRouter } from "next/navigation";
import React from "react";
import { useState } from "react";

const SERVER = 'http://localhost:8080'
export default function Home() {
  // const [username, setUsername] = useState('')
  // const [password, setPassword] = useState('')

  // const handleUsername = (e: any) => {
  //   setUsername(e.target.value)
  // }
  // const handlePassword = (e: any) => {
  //   setPassword(e.target.value)
  // }

  // const handleSumit = () =>{
  //   const url = `${SERVER}/api/login`
  //   const data = {username,password}
  //   const config = {
  //     headers: {
  //         "Cache-Control": "no-cache",
  //         "Content-Type": "application/json",
  //         Authorization: `Bearer blah ~`,
  //         "Access-Control-Allow-Origin": "*",
  //     }
  // }
  //   axios.post(url, data, config)
  //   .then(res=>res.data)
  // }

  const style = {
    backgroundColor: 'black',
    color : 'white',
  }

  return (<>
<body style={style}>
<div className="flex min-h-full flex-col justify-center px-6 py-12 lg:px-8">
  <div className="sm:mx-auto sm:w-full sm:max-w-sm">
    <img className="mx-auto h-200 w-auto" src="https://cdn-icons-png.flaticon.com/128/4169/4169062.png" alt="Your Company"/>
    <h2 className="mt-10 text-center text-2xl font-bold leading-9 tracking-tight to-blue-500">Sign in to continue</h2>
  </div>

  <div className="mt-10 sm:mx-auto sm:w-full sm:max-w-sm">
    <form className="space-y-6" action="#" method="POST">
      <div>
        <label htmlFor="email" className="block text-sm font-medium leading-6 text-balance">ID :</label>
        <div className="mt-2">
          <input id="username" name="username" type="text" autoComplete="email" required className="block w-full rounded-md border-0 bg-white/5 py-1.5 text-cyan-600 shadow-sm ring-1 ring-inset ring-red-500 focus:ring-2 focus:ring-inset focus:ring-balck sm:text-sm sm:leading-6"/>
        </div>
      </div>

      <div>
        <div className="flex items-center justify-between">
          <label htmlFor="password" className="block text-sm font-medium leading-6">Password : </label>
          <div className="text-sm">
            <a href="#" className="font-semibold text-red-500 hover:text-red-400">Forgot password?</a>
          </div>
        </div>
        <div className="mt-2">
          <input id="password" name="password" type="password"  autoComplete="current-password" required className="block w-full rounded-md border-0 bg-white/5 py-1.5 text-white shadow-sm ring-1 ring-inset ring-red-500 focus:ring-2 focus:ring-inset focus:ring-black sm:text-sm sm:leading-6"/>
        </div>
      </div>

      <div>
        <button type="submit" className="flex w-full justify-center rounded-md bg-red-500 px-3 py-1.5 text-sm font-semibold leading-6 text-white shadow-sm hover:bg-red-400 focus-visible:outline focus-visible:outline-2 focus-visible:outline-offset-2 focus-visible:outline-red-500">Sign in</button>
      </div>
    </form>

    <p className="mt-10 text-center text-sm text-gray-400">
      Not a member?&nbsp;&nbsp;&nbsp;
      <a href="#" className="font-semibold leading-6 text-red-500 hover:text-red-400">join us</a>
    </p>
  </div>
</div>

</body>
  </>);
}
